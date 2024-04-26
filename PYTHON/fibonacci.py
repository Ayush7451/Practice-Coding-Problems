def fib(n):
    if n < 0:
        raise ValueError("n must be a non-negative integer")
    elif n == 0 or n == 1:
        return n
    else:
        return fib(n - 1) + fib(n - 2)
def fib_sequence(n):
    sequence = []
    for i in range(n):
        sequence.append(fib(i))
    return sequence
import fibonacci
n = 10
sequence = fibonacci.fib_sequence(n)
print(sequence)