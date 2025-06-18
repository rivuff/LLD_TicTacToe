# Tic-Tac-Toe Game

This project is a **Tic-Tac-Toe** game implemented in Java. It allows multiple players to play the game on a customizable board size. The game includes features such as move validation, win/draw detection, and dynamic player management.

## Features

- **Customizable Board Size**: Initialize the game with any board size (e.g., 3x3, 4x4, etc.).
- **Player Management**: Add or remove players dynamically.
- **Win/Draw Detection**: Automatically detects when a player wins or when the game ends in a draw.
- **Interactive Gameplay**: Players take turns entering their moves via the console.

## Project Structure

The project follows a modular structure with the following key components:

### `src/main/java/com/machinecoding`
- **`models`**: Contains the core models like `Board`, `Player` `gamestate`.
- **`util`**: Includes utility classes and interfaces for win checking and move validation.
    - `statusChecker`: Interface for win/draw checking logic.
    - `gameStatusChecker`: Implementation of the win/draw checking logic.
- **`services`**: Contains the `GameService` class, which manages the game flow.

### `src/test/java/com/machinecoding`
- Contains unit tests for the core functionality of the game.

## Prerequisites

- **Java**: JDK 8 or higher.
- **Maven**: Ensure Maven is installed for dependency management and building the project.

## How to Run

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   java -cp target/<project-jar>.jar com.machinecoding.services.GameEngine
   ```

4. Follow the console prompts to play the game.

## How to Play

1. Initialize the game with a board size:
   ```
   Game initialized with NxN board.
   ```

2. Add players by specifying their names and symbols:
   ```
   Player <name> added with symbol <symbol>.
   ```

3. Players take turns entering their moves (row and column indices).

4. The game ends when:
    - A player wins, or
    - The board is full, resulting in a draw.

## Example Gameplay

```
Game initialized with 3x3 board.
Player Alice added with symbol X.
Player Bob added with symbol O.

Alice's [X]: Enter row and column: 
0 0
Bob's [O]: Enter row and column: 
1 1
...
Alice wins!
```

## `.gitignore`

The project includes a `.gitignore` file to exclude unnecessary files such as:
- Build artifacts (`target/`, `build/`)
- IDE-specific files (`.idea/`, `.vscode/`)
- OS-specific files (`.DS_Store`)

## Contributing

Feel free to fork the repository and submit pull requests for improvements or bug fixes.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
