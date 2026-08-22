bool checkDivisibility(int n) {
    int a = 0, m = 1, x = n;
    while (x > 0) {
        int r = x % 10;
        a += r;
        m *= r;
        x /= 10;
    }
    int s = a + m;
    if (s != 0 && n % s == 0) {
        return true;
    }
    return false;
}