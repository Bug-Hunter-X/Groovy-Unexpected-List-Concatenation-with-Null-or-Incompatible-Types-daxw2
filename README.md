# Groovy Unexpected List Concatenation Bug

This repository demonstrates a subtle bug in Groovy related to loose typing and handling of null values. The `foo` function is intended to add two numbers, but it unexpectedly concatenates lists when passed as arguments. This highlights a potential pitfall in Groovy where implicit type coercion can lead to unexpected results.

## How to reproduce

1. Clone the repository.
2. Run `bug.groovy` using a Groovy interpreter.
3. Observe the unexpected concatenation of lists instead of a clear error.

## Solution

The `bugSolution.groovy` file shows how to fix this by adding more robust type checking or handling.  Consider using explicit type declarations or adding checks for list types to prevent unexpected behavior.