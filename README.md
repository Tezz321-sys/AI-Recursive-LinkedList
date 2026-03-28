# AI Recursive Linked List Analysis

This repository contains a Java implementation of a recursive linked list (`LL_Rec.java`) and a transcript of an interaction with Claude AI (`Claude_Transcript.txt`).  

The purpose of this project is to evaluate Claude AI's reasoning about linked list insertion logic and demonstrate how its explanation changed, highlighting inconsistencies in AI-generated code analysis.

---

## Why This Matters

AI systems like Claude are increasingly used as learning tools. Inconsistent explanations can confuse learners, especially when studying recursion and data structures.  

This repository provides:  
- A working linked list Java implementation  
- A clear example of AI reasoning inconsistency  
- Correct logic tracing to compare with AI suggestions  

---

## Files in This Repository

- `LL_Rec.java` – Java implementation of a recursive linked list with add, delete, and display methods.  
- `Claude_Transcript.txt` – Full transcript of the conversation with Claude AI analyzing the linked list. Shows the AI changing its explanation and reasoning.  

---

## How to Use

1. Open `LL_Rec.java` in any Java IDE or compiler.  
2. Review the linked list methods and recursive insertion logic.  
3. Open `Claude_Transcript.txt` to see the step-by-step AI analysis and inconsistencies.  
4. Compare AI reasoning with the actual Java implementation to understand where the explanation went wrong.  

---

## Key Observations

- Claude AI initially stated that a tail update block in `addRec` was unreachable, then later contradicted itself.  
- Tracing the recursion manually confirms the tail block is indeed dead code, highlighting an AI reasoning inconsistency.  
- Recursive insertion logic in `LL_Rec.java` is correct and fully tested.  

---

## Future Work

- Extend this repository with additional recursive linked list operations (e.g., reverse, merge).  
- Explore more AI reasoning cases and document inconsistencies.  

I am also interested in opportunities to deepen my understanding of machine learning and AI development. Any guidance, recommended courses, or internship opportunities would be greatly appreciated.  

---

## Contact

For questions or discussion about this project, feel free to contact me via GitHub or email.
