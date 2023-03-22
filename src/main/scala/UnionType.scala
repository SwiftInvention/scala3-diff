type CellIndex = 0 | 1 | 2

def showCellIndex(x: CellIndex) = x match
  case 0 => "0"
  case 1 => "1"
  case 2 => "2"

def showInt(x: Int) = s"$x"
val exampleIndex: CellIndex = 1
val example = showInt(exampleIndex)
