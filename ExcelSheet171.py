def parse(letter):
    return ord(letter) - ord('A') + 1


def titleToNumber(self, columnTitle: str) -> int:
    result = 0

    for i, digit in enumerate(reversed(columnTitle)):
        result += (ord(digit) - ord('A') + 1) * 26 ** i
        print(result)

    return result


titleToNumber(self=1, columnTitle='C')