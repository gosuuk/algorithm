def solution(n, lost, reserve):
    count=0
    lost.sort()
    reserve.sort()
    for i in range(len(lost)):
        if lost[i] in reserve:
            reserve[reserve.index(lost[i])]=-1
            lost[i]= -10
            count+=1

    for i in range(len(lost)):
        for j in range(len(reserve)):
            if lost[i]-1<=reserve[j]<=lost[i]+1:
                lost[i]= -10
                reserve[j]=-1
                count+=1
    return n-len(lost)+count