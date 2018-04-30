# Stream

- **класс** `Stream` (`php\io\Stream`)
- **пакет** `std`
- **исходники** [`php/io/Stream.php`](./src/main/resources/JPHP-INF/sdk/php/io/Stream.php)

**Описание**

Class Stream

---

#### Свойства

- `->`[`path`](#prop-path) : `string`
- `->`[`mode`](#prop-mode) : `string`

---

#### Статичные Методы

- `Stream ::`[`of()`](#method-of)
- `Stream ::`[`getContents()`](#method-getcontents) - _Create a stream, call and return the result of the readFully() method, finally call the close() method._
- `Stream ::`[`putContents()`](#method-putcontents) - _Create a stream, call and return the result of the write() method, finally call the close() method._
- `Stream ::`[`tryAccess()`](#method-tryaccess) - _Open a stream and close it after calling $onAccess automatically._
- `Stream ::`[`exists()`](#method-exists) - _Checks stream is exists. It tries to open a stream and if all is ok, returns true and closes it._
- `Stream ::`[`register()`](#method-register)
- `Stream ::`[`unregister()`](#method-unregister)

---

#### Методы

- `->`[`getPath()`](#method-getpath)
- `->`[`getMode()`](#method-getmode)
- `->`[`read()`](#method-read)
- `->`[`readFully()`](#method-readfully)
- `->`[`readAll()`](#method-readall) - _Alias of readFully()._
- `->`[`write()`](#method-write)
- `->`[`parseAs()`](#method-parseas) - _Alias of readFormatted()._
- `->`[`readFormatted()`](#method-readformatted)
- `->`[`writeFormatted()`](#method-writeformatted)
- `->`[`eof()`](#method-eof)
- `->`[`seek()`](#method-seek)
- `->`[`getPosition()`](#method-getposition)
- `->`[`close()`](#method-close)
- `->`[`__construct()`](#method-__construct)
- `->`[`setContext()`](#method-setcontext)
- `->`[`getContext()`](#method-getcontext)
- `->`[`__toString()`](#method-__tostring) - _Alias of readFully() with converting to string always._
- `->`[`eachLine()`](#method-eachline) - _Each line of stream._

---
# Методы

<a name="method-getpath"></a>

### getPath()
```php
getPath(): string
```

---

<a name="method-getmode"></a>

### getMode()
```php
getMode(): string
```

---

<a name="method-read"></a>

### read()
```php
read(int $length): mixed
```

---

<a name="method-readfully"></a>

### readFully()
```php
readFully(): mixed
```

---

<a name="method-readall"></a>

### readAll()
```php
readAll(): mixed
```
Alias of readFully().

---

<a name="method-write"></a>

### write()
```php
write(string $value, null|int $length): int
```

---

<a name="method-parseas"></a>

### parseAs()
```php
parseAs(string $format, int $flags): mixed
```
Alias of readFormatted().

---

<a name="method-readformatted"></a>

### readFormatted()
```php
readFormatted(string $format, int $flags): mixed
```

---

<a name="method-writeformatted"></a>

### writeFormatted()
```php
writeFormatted( $value, string $format, int $flags): mixed
```

---

<a name="method-eof"></a>

### eof()
```php
eof(): bool
```

---

<a name="method-seek"></a>

### seek()
```php
seek(int $position): mixed
```

---

<a name="method-getposition"></a>

### getPosition()
```php
getPosition(): int
```

---

<a name="method-close"></a>

### close()
```php
close(): mixed
```

---

<a name="method-__construct"></a>

### __construct()
```php
__construct(string $path, null|string $mode): Stream
```

---

<a name="method-setcontext"></a>

### setContext()
```php
setContext( $context): void
```

---

<a name="method-getcontext"></a>

### getContext()
```php
getContext(): mixed
```

---

<a name="method-__tostring"></a>

### __toString()
```php
__toString(): string
```
Alias of readFully() with converting to string always.

---

<a name="method-eachline"></a>

### eachLine()
```php
eachLine(callable $callback, string|null $encoding): void
```
Each line of stream.

---