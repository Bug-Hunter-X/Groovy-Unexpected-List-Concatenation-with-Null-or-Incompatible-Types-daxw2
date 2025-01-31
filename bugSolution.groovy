```groovy
def foo(a, b) {
  if (a == null || b == null) {
    return null
  }
  if (a instanceof List || b instanceof List) {
    throw new IllegalArgumentException("Function does not support lists")
  }
  if (!(a instanceof Number) || !(b instanceof Number)) {
      throw new IllegalArgumentException("Function only supports Numbers")
  }
  return a + b
}

println foo(1, 2) // 3
println foo(null, 2) // null
println foo(1, null) // null
println foo(null, null) // null

try {
  println foo([1,2], [3,4])
} catch (IllegalArgumentException e) {
  println "Exception caught: ${e.message}"
}
```