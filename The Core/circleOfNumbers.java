int circleOfNumbers(int n, int firstNumber) {
    return n / 2 > firstNumber ? n / 2 + firstNumber : firstNumber - n / 2;
}
