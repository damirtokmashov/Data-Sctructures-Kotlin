package linkedList

class LinkedList<T> {
    private var head: Node<T>? = null // Текущий объект
    private var tail: Node<T>? = null // Конечный объект
    private var size = 0

    private fun isEmpty(): Boolean {
        return size == 0
    }

// Снова переопределяем метод, если лист не пустой, то вызывается ранее определнный метод с класса Node
    override fun toString(): String {
        return if (isEmpty()) {
            "Empty List"
        } else {
            head.toString()
        }
    }
// Функция добавляет объект сначала листа
    fun push(value: T): LinkedList<T> {
        head = Node(value, head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }
    // Функция добавляет объект в конец листа
    fun append(value: T){
        if (isEmpty()){
            push(value)
            return
        }
        tail?.next = Node(value = value)

        tail = tail?.next
        size++
    }
// Функция находит текущий объект по индексу
    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    // Функция добавляет новый объект после объекта найденной функции nodeAt()
    fun insert(value:T, afterNode: Node<T>): Node<T> {
        if (tail == afterNode) {
            append(value)
            return tail!!
        }

        val newNode = Node(value, afterNode.next)

        afterNode.next = newNode
        size++
        return newNode
    }
}

