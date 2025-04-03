
# 👯‍♀️ GitHub Collaboration Exercise: Silly Website Project

> By Mathias Grindsäter and ChatGPT.
> Learn how to collaborate using Git: issues, branches, pull requests, and shared code editing.  
> Participants: **2 people**  
> Outcome: Understand real-world GitHub workflows and encounter a merge conflict naturally.

---

## 🧍 Roles

- **Person 1**: Creates the GitHub repo and sets things up.
- **Person 2**: Joins as a collaborator and contributes.

---

## 🚀 Part 1: Setup

### ✅ Step 1: Person 1 creates the repository

- Go to GitHub and create a new repository named `collab-html-test`.
- Check **"Initialize this repository with a README"**.
- Go to **Settings → Collaborators** and invite **Person 2** by their GitHub username.

---

### ✅ Step 2: Both clone the repository

Open your terminal and clone the repo.

---

### ✅ Step 3: Person 1 adds a starting HTML file

Create a file named `index.html` with the following content:

```html
<!DOCTYPE html>
<html>
<head>
  <title>Fun Website</title>
</head>
<body>
  <h1>Welcome to Our Silly Website!</h1>
</body>
</html>
```

Then run:

```bash
git add index.html
git commit -m "Add base HTML page"
git push
```

---

## 📝 Part 2: Create and Assign Issues

Each person creates **2 issues** in the GitHub repo.

### 👤 Person 1 creates:

- Issue 1: Add a footer  
- Issue 2: Add a funny image

### 👤 Person 2 creates:

- Issue 3: Add a background color  
- Issue 4: Add a button with a message

Assign the issues like this:

- Person 1 works on **Issue 1** and reviews **Issue 3**.  
- Person 2 works on **Issue 3** and reviews **Issue 1**.

---

## 🌿 Part 3: Work on Tasks Using Branches

### ✅ Step 1: Create a branch from the issue

1. Go to your assigned issue on GitHub.  
2. Click **"Create a branch"**.  
3. Follow the instructions GitHub provides, typically:

```bash
git fetch origin
git checkout [branchname]
```

Run `git branch` and make sure the current branch is marked with a `*`.

---

### ✅ Step 2: Make your changes

#### 👤 Person 1 — Add a footer

Update `index.html` like this:

```html
<body>
  <h1>Welcome to Our Silly Website!</h1>

  <footer>
    <p>Made with laughter and HTML 😂</p>
  </footer>
</body>
```

Then run:

```bash
git add index.html
git commit -m "Add footer"
git push
git status
```

You should see:

```
Your branch is ahead of 'origin/main' by 1 commit.
```

---

#### 👤 Person 2 — Add a background color

Update the `<body>` tag in `index.html` like this:

```html
<body style="background-color: lavender;">
  <h1>Welcome to Our Silly Website!</h1>
</body>
```

Then run:

```bash
git add index.html
git commit -m "Add background color"
git push
git status
```

You should see:

```
Your branch is ahead of 'origin/main' by 1 commit.
```

---

### ✅ Step 3: Open a pull request

Each person:

1. Go to GitHub.  
2. Click **“Compare & pull request”** next to your branch.  
3. Add a brief description of the change.  
4. Assign your teammate as a reviewer.

---

## 🔁 Part 4: Review and Merge

Each person:

- Reviews their teammate’s pull request.  
- Clicks **“Merge”** when ready.

After merging:

1. Delete the branch on GitHub.  
2. Delete the branch locally:

```bash
git branch -d [branchname]
```

3. Pull the latest changes from `main`:

```bash
git checkout main
git pull
```

Now both of you are up to date.

---

## 🎁 Optional: Merge Conflict

If you both edited the same part of the file (for example, the `<body>` section), GitHub may show a **merge conflict** when the second pull request is opened or merged.

If that happens:

1. GitHub will display:

```
This branch has conflicts that must be resolved
```

2. Click **“Resolve conflicts”**.  
3. GitHub will show both versions of the conflicting code like this:

```html
<<<<<<< your-branch
<p>Contact us at nonsense@example.com 😂</p>
=======
<p>Made with laughter and HTML 😂</p>
>>>>>>> main
```

4. Manually edit to combine both changes. For example:

```html
<footer>
  <p>Made with laughter 😂 | Contact us at nonsense@example.com</p>
</footer>
```

5. Click **“Mark as resolved”** → Commit → Merge.

---

## ✅ Wrap-Up

You’ve now completed a full GitHub collaboration workflow:

- Created and cloned a repository  
- Created and assigned issues  
- Created branches from issues  
- Made and pushed changes  
- Opened, reviewed, and merged pull requests  
- Potentially resolved a merge conflict

---

