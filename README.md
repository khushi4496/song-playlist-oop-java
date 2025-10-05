# song-playlist-oop-java
# 🎵 Song Playlist Management System

## 📘 Overview
A **Java-based OOP project** that simulates a simple music platform where users (subscribers) can download, delete, and view songs from a shared playlist.  
It demonstrates core Object-Oriented Programming principles — **Encapsulation, Composition, and Method Overriding** — along with practical class interactions.

---

## ⚙️ Features
- 🎶 **Add/Remove Songs** — Manage a central playlist of available songs.  
- 👤 **Subscribers** — Each user maintains a personal playlist.  
- 📥 **Download/Delete Songs** — Check song availability before actions.  
- 🧠 **OOP Concepts Used** — `equals()`, `hashCode()`, and `toString()` overrides for proper comparisons and clean output.

---

## 🧩 Class Structure
| Class | Description |
|--------|--------------|
| `Song` | Represents a song; overrides `equals`, `hashCode`, and `toString` |
| `SongPlaylist` | Manages all songs available for download |
| `Subscriber` | Handles each user’s personal playlist (download/delete/display) |
| `Main` | Entry point to test the system |

---

## 💻 Example Usage
```java
SongPlaylist playlist = new SongPlaylist();
playlist.addSong(new Song("Dope"));
playlist.addSong(new Song("Fire"));

Subscriber user = new Subscriber("khushi1245");
user.downloadSong(playlist, new Song("Dope"));
user.displayUserPlaylist();

Output:

Dope downloaded
khushi1245 possesses songs:
- Dope

📚 Key Learning Highlights

How to correctly override equals() and hashCode() for list comparisons.

How to apply Encapsulation and Composition between classes.

Use of ArrayList and custom class interactions for modular design.

🏗️ Project Setup

Copy all class files (Song, SongPlaylist, Subscriber, Main) into the same package.

Compile and run Main.java.

Interact via console outputs.

🧑‍💻 Author

Khushi Singh
A Java enthusiast building OOP-based mini projects for interview and internship preparation (Google, Uber, etc.).

---

Would you like me to also write a **1-line GitHub repository description** and **tags** (the ones that appear right below your repo name on GitHub)?  
They help your repo rank higher and look professional to recruiters.
