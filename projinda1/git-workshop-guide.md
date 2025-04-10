By Mathias and ChatGPT
Comment: We do some things on the main branch, often you may work on other branches, however,
the things brought up here transfer to branches in general.

# 🧪 Git Workshop: Branching, Merging, Conflicts, Reverts & Remote Collaboration

## 📌 Creating Branches, Merging & Git Conflicts

### 1. Set Up
- Create a new test repo on GitHub and clone it locally.
- Run:
  ```bash
  git status
  ```
  You'll see a message mentioning `origin/main`. What is this?

### 2. Create a New Branch
- Create and switch to a new branch:
  ```bash
  git switch -c feature-a
  ```
- Confirm you're on the correct branch:
  ```bash
  git branch
  ```

### 3. Make a Change in the Feature Branch
- Create and edit `hello.txt` with the text:
  ```
  Hello from feature A!
  ```
- Use Vim (or any editor). In Vim:
  - Press `i` to insert.
  - Type your text.
  - Press `Esc`, then `:wq` to write and quit.

- Check status:
  ```bash
  git status
  ```
- If the file is untracked, add and commit it:
  ```bash
  git add hello.txt
  git commit -m "Changed hello.txt with feature A"
  ```

### 4. Switch Back to `main` and Add Another Change
- Switch:
  ```bash
  git switch main
  git branch  # Confirm you're on main
  ls          # Notice hello.txt is not here yet!
  ```

- Create `hello.txt` again in `main` with:
  ```
  Writing in hello.txt in main branch
  ```

- Add and commit:
  ```bash
  git add hello.txt
  git commit -m "Added hello.txt in main branch"
  ```

## ⚔️ Merge & Handle Conflict

Now both `main` and `feature-a` have a `hello.txt` with different content.

- Merge `feature-a` into `main`:
  ```bash
  git merge feature-a
  ```

> ⚠️ You’ll hit a **merge conflict**. Why? Because both branches modified the same file in different ways.

### Fix the Conflict
- Open `hello.txt` (use VS Code or any editor).
- You'll see something like:
  ```
  <<<<<<< HEAD
  Writing in hello.txt in main branch
  =======
  Hello from feature A!
  >>>>>>> feature-a
  ```

- Choose how to resolve it. For now, go with:
  ```
  Hello from feature A!
  Writing in hello.txt in main branch
  ```

- Save the file, then:
  ```bash
  git add hello.txt
  git commit
  ```

- Check the result:
  ```bash
  cat hello.txt
  ```

### 5. Clean Up
- You're done with `feature-a`, so delete it:
  ```bash
  git branch -d feature-a
  ```

- Check your history:
  ```bash
  git log --oneline --graph --all --decorate
  ```

> It's beautiful! You might not understand everything in the graph yet — ask questions!

- Often, `git log --oneline` is enough for a quick overview.
- See just merge commits:
  ```bash
  git log --oneline --merges
  ```

## 🔁 Git Revert

We all make mistakes. Let’s say we realize we **don’t want feature A anymore** and want `main` to go back to how it was before the merge.

### Merge Commits Have Two Parents:
- Parent 1 = the branch you were **on** (`main`)
- Parent 2 = the branch you **merged in** (`feature-a`)

### Revert the Merge
Choose to keep `main` and remove `feature-a`:
```bash
git revert -m 1 <merge-commit-id>
```

- This creates a new commit that undoes the **effects** of the merge.
- Check:
  ```bash
  git log --oneline
  cat hello.txt
  ```

### Revert a Normal Commit
- Add a second line in `hello.txt`:
  ```
  This is me writing on line 2
  ```
  Then add and commit:
  ```bash
  git commit -am "Added second line"
  ```

- Do the same for a third line:
  ```bash
  git commit -am "Added third line"
  ```

- Now revert the third line:
  ```bash
  git revert <commit-id>
  ```

> If a conflict happens, solve it just like the merge!

- Confirm:
  ```bash
  git log --oneline
  cat hello.txt
  ```

## 💣 Git Reset

You can also go back in time completely (be careful!).

```bash
git reset --hard <commit-id>
```

> This wipes out all commits **after** that point. You just time-traveled. 🕰️

There are 3 types of resets:

| Type        | Keeps Changes | Rewrites History | Use Case                          |
|-------------|----------------|-------------------|-----------------------------------|
| `--soft`    | ✅ (staged)     | ✅                | Undo commits, keep changes staged |
| `--mixed`   | ✅ (unstaged)   | ✅                | Undo commits, keep local changes  |
| `--hard`    | ❌              | ✅                | Start over completely             |

## 📡 Local vs Remote Branches

| Branch Name     | What It Is                           |
|-----------------|--------------------------------------|
| `main`          | Your local branch                    |
| `origin/main`   | Remote branch from GitHub or server  |

```bash
git fetch origin
```

> Updates your view of `origin/*` but doesn’t modify your files.

## 🧭 Git Sync 101

### 🔄 `git fetch`
```bash
git fetch origin
```
> See what’s new remotely — doesn’t change your local files.

### ⬇️ `git pull`
```bash
git pull origin main
```
> Fetch + merge the remote branch into your local one.

### ⬆️ `git push`
```bash
git push origin main
```
> Upload your local commits to the remote repo.

## 🔍 See What Others Are Doing

- See commits on remote you don’t have:
  ```bash
  git log main..origin/main --oneline
  ```

- See your commits not on remote:
  ```bash
  git log origin/main..main --oneline
  ```

## 🧪 Final Sync Exercise

1. Run:
   ```bash
   git log main..origin/main --oneline
   ```
2. Then:
   ```bash
   git log origin/main..main --oneline
   ```

3. Go to GitHub → add a file → commit to `main`.

4. Back in terminal:
   ```bash
   git fetch origin
   git status
   git log main..origin/main --oneline
   ```

5. Merge changes:
   ```bash
   git merge origin/main
   ```

6. Confirm:
   ```bash
   git log --oneline
   ```

7. Push your changes:
   ```bash
   git push origin main
   ```
