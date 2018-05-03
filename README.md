# Rethrowables
A collection of functions and functional interfaces to wrap methods declared with throws clause. Code with in functional way and forget about boilerplate try-catches!

```java
list.forEach(it -> functionThatThrowsExeption(it)); // compilation error
list.forEach(it -> Rethrowables.call(x -> functionThatThrowsExeption(it))); // compiled!
```
