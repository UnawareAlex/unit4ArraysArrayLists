// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  private char grid[][];
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    this.grid = new char[rows][cols];
    
    for (int i = 0; i < grid.length; i++)
    {
        for (int j = 0; j < grid[i].length; j++)
        {
            grid[i][j] = ' ';
        }
    }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill  character
  public CharMatrix(int rows, int cols, char fill)
  {
    this.grid = new char[rows][cols];
    
    for (int i = 0; i < grid.length; i++)
    {
        for (int j = 0; j < grid[i].length; j++)
        {
            grid[i][j] = fill;
        }
    }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
    return grid.length;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    return grid[0].length;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    char character = grid[row][col];
    return character;
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    grid[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    char character = grid[row][col];
    if (character == ' ')
    {
        return true;
    }
    else
    {
        return false;
    }
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    int i = row0;
    int j = col0;
    while (i <= row1)
    {
        while (j <= col1)
        {
            grid[i][j] = fill;
            j++;
        }
        i++;
    }
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    int i = row0;
    int j = col0;
    while (i <= row1)
    {
        while (j <= col1)
        {
            grid[i][j] = ' ';
            j++;
        }
        i++;
    }
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int charCount = 0;
    
    for (int i = 0; i < grid[row].length; i++)
    {
        if (grid[row][i] != ' ')
        {
            charCount++;
        }
    }
    return charCount;
  }

 // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int charCount = 0;
    
    for (int i = 0; i < grid[col].length; i++)
    {
        if (grid[col][i] != ' ')
        {
            charCount++;
        }
    }
    return charCount;
  }
  }
