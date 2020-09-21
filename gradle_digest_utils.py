#!/usr/bin/python3
import sys
import hashlib

gradle_url = "https://services.gradle.org/distributions/gradle-%s.zip"


def base36encode(number):
    alphabet, base36 = ['0123456789abcdefghijklmnopqrstuvwxyz', '']

    while number:
        number, i = divmod(number, 36)
        base36 = alphabet[i] + base36

    return base36 or alphabet[0]


def main():
    if len(sys.argv) > 1:
        gradle_version = sys.argv[1].strip()
        complete_url = gradle_url % gradle_version

        md5 = hashlib.md5()
        md5.update(complete_url.encode("utf-8"))

        num = int.from_bytes(md5.digest(), byteorder='big', signed=False)

        # Base36
        alphabet, base36 = ['0123456789abcdefghijklmnopqrstuvwxyz', '']

        while num:
            num, i = divmod(num, 36)
            base36 = alphabet[i] + base36

        print(base36 or alphabet[0])
    else:
        raise ValueError("Need Gradle Version As Arguement! Such As x.x.x-all")


if __name__ == "__main__":
    main()
