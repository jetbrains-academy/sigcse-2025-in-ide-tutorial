The conditional operator (the `if` expression)
is used when the program has some choice.
For example, if the variable contains a positive number, display it on the screen,
otherwise do nothing.
Or, if the guess matches the secret, end the game.

Consider the following example:
```python
if y > 0:
    print(y)
```
Another example:
```python
if x > y:
    print(x)
else:
    # The opposite condition: x <= y
    print(y)
```

For the `else` branch, the reverse of the original condition is used: for example,
for `x > y`, the opposite condition is `x <= y`.
