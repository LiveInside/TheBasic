import static org.assertj.core.api.Assertions.assertThat;

import org.example.TheBasics;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TheBasicsTest {
    // Физзбазз
    @Test
    public void testFizzBuzz1() {
        final String expected = "";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TheBasics.fizzBuzz(1, 0);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void testFizzBuzz2() {
        final String expected = "Buzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TheBasics.fizzBuzz(10, 10);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void testFizzBuzz3() {
        final String expected = "1\n2";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TheBasics.fizzBuzz(1, 2);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void testFizzBuzz4() {
        final String expected = "Fizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TheBasics.fizzBuzz(3, 10);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void testFizzBuzz5() {
        final String expected = "8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TheBasics.fizzBuzz(8, 20);

        final String actual = out.toString().trim();

        assertThat(actual).isEqualTo(expected);
    }
    // Сбалансированные скобки
    @Test
    public void testIsBalance() {
        assertThat(TheBasics.isBalanced("()")).isTrue();
        assertThat(TheBasics.isBalanced("(())")).isTrue();
        assertThat(TheBasics.isBalanced("(()((((())))))")).isTrue();
        assertThat(TheBasics.isBalanced("((")).isFalse();
        assertThat(TheBasics.isBalanced(")")).isFalse();
        assertThat(TheBasics.isBalanced("())(")).isFalse();
        assertThat(TheBasics.isBalanced("((())")).isFalse();
        assertThat(TheBasics.isBalanced("(())())")).isFalse();
        assertThat(TheBasics.isBalanced("(()(()))))")).isFalse();
        assertThat(TheBasics.isBalanced("())(()")).isFalse();
    }
    // Фибоначчи
    @Test
    public void testFib() {
        assertThat(TheBasics.fib(0)).isEqualTo(0);
        assertThat(TheBasics.fib(1)).isEqualTo(1);
        assertThat(TheBasics.fib(2)).isEqualTo(1);
        assertThat(TheBasics.fib(3)).isEqualTo(2);
        assertThat(TheBasics.fib(4)).isEqualTo(3);
        assertThat(TheBasics.fib(5)).isEqualTo(5);
        assertThat(TheBasics.fib(10)).isEqualTo(55);
    }
    // Степень тройки
    @Test
    public void testIsPowerOfThree() {
        assertThat(TheBasics.isPowerOfThree(0)).isFalse();
        assertThat(TheBasics.isPowerOfThree(1)).isTrue();
        assertThat(TheBasics.isPowerOfThree(3)).isTrue();
        assertThat(TheBasics.isPowerOfThree(6)).isFalse();
        assertThat(TheBasics.isPowerOfThree(9)).isTrue();
        assertThat(TheBasics.isPowerOfThree(27)).isTrue();
        assertThat(TheBasics.isPowerOfThree(81)).isTrue();
        assertThat(TheBasics.isPowerOfThree(111)).isFalse();
    }
    // Разница углов
    @Test
    public void testDiff() {
        assertThat(TheBasics.diff(0, 0)).isEqualTo(0);
        assertThat(TheBasics.diff(0, 90)).isEqualTo(90);
        assertThat(TheBasics.diff(0, 180)).isEqualTo(180);
        assertThat(TheBasics.diff(0, 190)).isEqualTo(170);
        assertThat(TheBasics.diff(190, 0)).isEqualTo(170);
        assertThat(TheBasics.diff(300, 45)).isEqualTo(105);
        assertThat(TheBasics.diff(240, 300)).isEqualTo(60);
        assertThat(TheBasics.diff(120, 30)).isEqualTo(90);
    }
    // Преобразование DNA в RNA
    @Test
    public void testDnaToRna() {
        assertThat(TheBasics.dnaToRna("")).isEqualTo("");
        assertThat(TheBasics.dnaToRna("ACGTGGTCTTAA")).isEqualTo("UGCACCAGAAUU");
        assertThat(TheBasics.dnaToRna("CCGTA")).isEqualTo("GGCAU");
        assertThat(TheBasics.dnaToRna("ACNTG")).isNull();
    }
    // Складываем цифры
    @Test
    public void testAddDigits() {
        assertThat(TheBasics.addDigits(0)).isEqualTo(0);
        assertThat(TheBasics.addDigits(1)).isEqualTo(1);
        assertThat(TheBasics.addDigits(9)).isEqualTo(9);
        assertThat(TheBasics.addDigits(10)).isEqualTo(1);
        assertThat(TheBasics.addDigits(19)).isEqualTo(1);
        assertThat(TheBasics.addDigits(38)).isEqualTo(2);
        assertThat(TheBasics.addDigits(1259)).isEqualTo(8);
    }
}