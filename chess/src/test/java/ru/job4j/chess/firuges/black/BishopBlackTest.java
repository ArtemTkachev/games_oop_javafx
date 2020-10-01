package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenCreatePositionThenSameGetPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell cell = bishopBlack.position();
        assertThat(cell, is(Cell.C1));
    }

    @Test
    public void whenCopyFigurePositionThenSameFigurePosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F1);
        Figure bishopBlackNew = bishopBlack.copy(Cell.H3);
        assertThat(bishopBlackNew.position(), is(Cell.H3));
    }

    @Test
    public void whenWayIsCorrectThenCorrectArrayOfCell() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = bishopBlack.way(Cell.G5);
        assertThat(cells, is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenWayIsNotOnDiagonalThenException() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = bishopBlack.way(Cell.G6);
    }
}