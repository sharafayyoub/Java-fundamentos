## Purpose
Help AI coding agents be immediately productive in this repository: small, single-file Java exercises at the repository root.

## Repo snapshot (what you'll see)
- Top-level files only (no src/ or build config). Example files in this repo: `ejercicio1.java`, `README.md`.
- `README.md` is minimal; there are no build scripts, test frameworks, or CI config to infer workflows from.

## High-level guidance for edits
- This repo contains isolated Java exercise files. When editing or adding files, follow these observable conventions:
  - Files live at the repository root (not under `src/`).
  - Each public class must be in its own `.java` file and its filename must match the public class name (case-sensitive). Example: `public class Ejemplo` -> `Ejemplo.java`.
  - No package declarations are present in examples; treat files as default-package when compiling and running.

## Build / run (concrete commands — Windows PowerShell)
Use the JDK tools directly (no build system present):

Compile a single file:
```powershell
javac ejercicio1.java
```
Run the compiled class (class name must match file name without `.java`):
```powershell
java ejercicio1
```
If you add a package declaration, ensure files live in matching directories and run from the repository root with the package-qualified class name.

## Project-specific patterns & gotchas (examples from this repo)
- The provided `ejercicio1.java` contains common typos and non-compiling code. When fixing or suggesting edits, prefer minimal, compile-ready diffs.
  - Example problems to fix: `pubkic` -> `public`, `sattic` -> `static`, `Srtring` -> `String`.
  - Ensure the `main` signature is exactly: `public static void main(String[] args)`.

## What to do when improving code
- Prefer the smallest change that makes the file compile and preserves the original exercise intent.
- If renaming classes/files, update references and explain why the change was necessary in the commit/PR message.

## Files to reference when making suggestions
- `ejercicio1.java` — shows many of the lightweight edits typical for this repo. Use it as the canonical example for edit style.
- `README.md` — currently minimal; avoid making large documentation changes unless you also update examples and commands.

## Do NOT assume
- There is no build system, test harness, or CI configuration. Do not add complex build tools without asking the maintainer.

## When to ask for human input
- When adding a new project-wide convention (packages, a build tool), or when a change touches many files — ask the repo owner for approval.

---
If any part of this file is unclear or you'd like more examples (for instance, a small test harness or preferred commit message style), tell me which area to expand and I'll update this file.
