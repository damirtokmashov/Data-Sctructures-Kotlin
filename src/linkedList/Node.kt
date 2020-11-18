package linkedList
// Создаем класс (узел) содержащий значение текущего объекта и ссылку на следующий
class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String { // Переопределяем метод, т.к вызывается вместе с println()
        return if (next != null){   // Если нет ссылки на след объект, возвращаем лишь значение текущего
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}