import org.amshove.kluent.shouldBeEqualTo
import org.example.section07._0706.MyOperators
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestOperatorOverload {

    lateinit var p1: MyOperators
    lateinit var p2: MyOperators

    @BeforeAll
    fun setup() {
        p1 = MyOperators(200, 100)
        p2 = MyOperators(1000, 2000)
    }

    @Test
    fun `Chamando OperatorOverload com "(200, 100) plus (1000, 2000)" retornando MyOperators(num1=1200, num2=2100)`() {
        val p3 = p1 + p2
        p3.toString() shouldBeEqualTo "MyOperators(num1=1200, num2=2100)"
    }

    @Test
    fun `Chamando OperatorOverload com "(200, 100) minus (1000, 2000)" retornando MyOperators(num1=-800, num2=-1900)`() {
        val p3 = p1 - p2
        p3.toString() shouldBeEqualTo "MyOperators(num1=-800, num2=-1900)"
    }
}