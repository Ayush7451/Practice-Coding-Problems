def count_duplicates(list):
    Cnt = {}
    for num in list:
        if num in Cnt:
            Cnt[num] += 1
        else:
            Cnt[num] = 1
    return Cnt
list = [5, 2, 2, 1, 6, 6, 3, 3, 2, 1]
print(count_duplicates(list))