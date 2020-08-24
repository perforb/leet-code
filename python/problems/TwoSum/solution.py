from typing import List


def two_sum(nums: List[int], target: int) -> List[int]:
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in seen:
            return [seen[complement], i]
        seen[nums[i]] = i
    return []


if __name__ == '__main__':
    print(two_sum([2, 7, 11, 15], 9))  # [0, 1]
