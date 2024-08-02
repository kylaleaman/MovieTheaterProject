public class MovieTheater {
    private char[][] seats;

    public MovieTheater(int rows, int cols) {
        seats = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = '0';
            }
        }
    }

    public void displaySeatingChart() {
        System.out.println("Seating Chart:");
        for (char[] row : seats) {
            for (char seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public boolean reserveSeat(int row, int col) {
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            System.out.println("Invalid seat position.");
            return false;
        }

        if (seats[row][col] == 'X') {
            System.out.println("Seat is already taken.");
            return false;
        } else {
            seats[row][col] = 'X';
            System.out.println("Seat reserved successfully.");
            return true;
        }
    }

    public static void main(String[] args) {
        MovieTheater theater = new MovieTheater(5, 10);

        theater.displaySeatingChart();

        theater.reserveSeat(2, 3);
        theater.reserveSeat(0, 0);
        theater.reserveSeat(4, 9);

        theater.reserveSeat(2, 3);

        theater.displaySeatingChart();

        theater.reserveSeat(5, 10);
    }
}

