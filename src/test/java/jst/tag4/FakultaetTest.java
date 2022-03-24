package jst.tag4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultaetTest {

    Fakultaet faculty = new Fakultaet();

    @Test
    void faculty_when0_then1() {
        assertEquals(1, faculty.faculty(0));
    }
    @Test
    void faculty_when1_then1() {
        assertEquals(1, faculty.faculty(1));
    }
    @Test
    void faculty_when2_then2() {
        assertEquals(2, faculty.faculty(2));
    }
    @Test
    void faculty_when3_then6() {
        assertEquals(6, faculty.faculty(3));
    }
    @Test
    void faculty_when10_then3628800() {
        assertEquals(3628800, faculty.faculty(10));
    }
    @Test
    void faculty_when15_then1307674368000() {
        assertEquals(1307674368000l, faculty.faculty(15));
    }
}