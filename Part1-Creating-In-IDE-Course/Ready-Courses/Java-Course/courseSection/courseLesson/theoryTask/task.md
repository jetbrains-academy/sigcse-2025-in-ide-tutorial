The conditional operator (the [`if`](https://kotlinlang.org/docs/control-flow.html#if-expression) expression)
is used when the program has some choice.
For example, if the variable contains a positive number, display it on the screen,
otherwise do nothing.
Or, if the guess matches the secret, end the game.

Consider the following example:
```java
if (y > 0) {
    System.out.println(y);
}
```
Another example:
```java
if (x > y) {
    System.out.println(x);
} else {
    // The opposite condition: x <= y
    System.out.println(y);
}
```

For the `else` branch, the reverse of the original condition is used: for example,
for `x > y`, the opposite condition is `x <= y`.
