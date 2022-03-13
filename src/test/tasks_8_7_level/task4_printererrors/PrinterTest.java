package tasks_8_7_level.task4_printererrors;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import tasks_8_7_level.task4_printererrors.Printer;

class PrinterTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }
}