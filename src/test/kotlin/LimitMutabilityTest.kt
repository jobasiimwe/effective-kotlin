import org.junit.jupiter.api.Test
import kotlin.concurrent.thread

internal class LimitMutabilityTest {
    @Test
    fun test_valCanHoldMutableObject() {
        LimitMutability().valCanHoldMutableObject()
    }

    @Test
    fun test_threads_cause_problems() {
        var num = 0
        for (i in 1..1000) {
            thread {
                Thread.sleep(10)
                num += 1
            }
        }
        Thread.sleep(5000)
        print("*************")
        print(num)
        print("************")
    }

    @Test
    fun test_threads_with_synchronized_block_work_well() {
        val lock = Any()
        var num = 0
        for (i in 1..1000) {
            thread {
                Thread.sleep(10)
                synchronized(lock) {
                    num += 1
                }
            }
        }
        Thread.sleep(5000)
        print("*************")
        print(num)
        print("************")
    }

    @Test
    fun test_threads_can_cause_concurentModificationException() {
        var nummbers = mutableListOf<Int>()
        for (i in 1..1000) {
            thread {
                Thread.sleep(1)
                nummbers.add(i)
            }
            thread {
                Thread.sleep(1)
                println(nummbers.sum())
            }
        }
    }


}