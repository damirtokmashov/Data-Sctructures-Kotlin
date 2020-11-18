package linkedList


fun main() {
    /*Push example*/
    val pushLinkedList = LinkedList<Int>()
    pushLinkedList.push(4).push(2).push(1)

    println(pushLinkedList)

    /*Append example*/
    println()
    val appendLinkedList = LinkedList<Int>()
    appendLinkedList.append(1)
    appendLinkedList.append(2)
    appendLinkedList.append(2)
    println(appendLinkedList)

    /*Insert Example*/
    println()
    val insertLinkedList = LinkedList<Int>()
    insertLinkedList.push(3)
    insertLinkedList.push(2)
    insertLinkedList.push(1)

    println("Before inserting: $insertLinkedList")
    var middleNode = insertLinkedList.nodeAt(1)!!
    for (i in 1..3){
        middleNode = insertLinkedList.insert(-1 * i, middleNode)
    }
    println("After inserting: $insertLinkedList")
}