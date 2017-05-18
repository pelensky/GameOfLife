[![Build Status](https://travis-ci.org/pelensky/GameOfLife.svg?branch=master)](https://travis-ci.org/pelensky/GameOfLife)
[![Coverage Status](https://coveralls.io/repos/github/pelensky/GameOfLife/badge.svg?branch=master)](https://coveralls.io/github/pelensky/GameOfLife?branch=master)

# Conway's Game of Life

The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970.

The "game" is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input. One interacts with the Game of Life by creating an initial configuration and observing how it evolves, or, for advanced "players", by creating patterns with particular properties.

[Further information](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life)

#### Rules 

1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
2. Any live cell with two or three live neighbours lives on to the next generation.
3. Any live cell with more than three live neighbours dies, as if by overpopulation.
4. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.