type CellIndex = 0 | 1 | 2

// CellIndex is more narrow than Int
def showCellIndex(x: CellIndex) = x match
  case 0 => "0"
  case 1 => "1"
  case 2 => "2"

// CellIndex can be used as Int
def showInt(x: Int) = s"$x"
val exampleIndex: CellIndex = 1
val example = showInt(exampleIndex)
