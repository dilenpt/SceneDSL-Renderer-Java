SceneDSL Renderer (CMSC 330 Project 1)

This project is a Java-based graphics scene renderer that parses a domain-specific language (DSL) defined in a scene file and displays the specified graphical elements using Java's AWT graphics library.

 📚 Project Overview

This project was developed for **CMSC 330 - Organization of Programming Languages**. It extends a provided Java skeleton to support parsing and rendering of graphical scenes based on an expanded EBNF grammar.

 Supported Shapes:
- Right Triangle
- Rectangle
- Isosceles Triangle
- Parallelogram
- Regular Polygon
- Text

The program reads a scene definition file, parses its contents, creates shape objects, and renders the full scene graphically.

---

 📄 Grammar Specification


scene → SCENE IDENTIFIER number_list images END '.'
images → image images | image
image →
    right_triangle | rectangle | parallelogram |
    regular_polygon | isosceles | text


(Terminals, non-terminals, and formatting follow the original EBNF syntax provided.)

---

 📂 Project Structure

/src
  ├── Parser.java             # Modified to support new grammar rules
  ├── Lexer.java              # Updated to tokenize new keywords and string literals
  ├── Tokens.java             # Extended with new tokens
  ├── Text.java               # New class for rendering text
  ├── SolidPolygon.java       # New class for regular polygons
  ├── IsoscelesTriangle.java  # New class for isosceles triangles
  ├── Parallelogram.java      # New class for parallelograms
  ├── RegularPolygon.java     # New class for regular polygons
  └── ...                     # Other provided and updated skeleton files




 🛠️ How to Run

1. Compile all `.java` files:
   ```bash
   javac *.java
   

2. Run the main class (usually `Main` or similar):
   ```bash
   java Main scene.txt
   ```

   Replace `scene.txt` with your scene definition file.



 ✅ Test Plan

The program was tested using a variety of scene files that include:

- Single and multiple shapes
- Edge cases for color values and dimensions
- Valid and invalid syntax
- Mixed shape types

**Example test file:**

Scene Test (500, 500)
RightTriangle Color (255, 0, 0) at (50, 30) Height 100 Width 300;
Rectangle Color (0, 128, 255) at (100, 100) Height 200 Width 100;
Text Color (0, 0, 0) at (400, 200) "Hello World";
End.


---

 🧠 Lessons Learned

- How to extend a recursive-descent parser
- Working with abstract classes and Java's graphics API
- Designing and implementing new grammar rules
- Handling custom tokens and string parsing

---

 ✍️ Author

Dilen Patel  
Project 1: Scene Renderer

---

 



Let me know if you want to include example output images or add GitHub Pages support for a demo!
