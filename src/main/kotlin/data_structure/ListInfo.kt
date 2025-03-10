package data_structure

import java.util.LinkedList

class ListInfo {

    fun linkedListTest(){

        val linkedList = LinkedList<Int>()

        linkedList.add(1)
        linkedList.add(2)

        for (i in linkedList){
            println(i)
        }


    }

}

fun main(){

    val s = ListInfo()

    s.linkedListTest()
}