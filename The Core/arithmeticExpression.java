boolean arithmeticExpression(int A, int B, int C) {
    return A + B == C || A - B == C || A * B == C || (A % B == 0 && A / B == C);
}
