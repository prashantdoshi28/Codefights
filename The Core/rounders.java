int rounders(int value) {
    int p = 10;
    int n = value;
    while (n > p) {
    if ((n % p) / (p / 10) < 5)
      n = (n/p) * p;
    else
      n = (n / p + 1) * p;
      p *= 10;
  }
  return n;
}
