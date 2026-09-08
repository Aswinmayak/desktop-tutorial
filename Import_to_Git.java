public class Import_to_Git {
    public static void main(String[] args){
        /*This file is created in this Git_learning folder from VScode.
        //Now we are going to move this file to the git .
        Step 1: -> Change the directory to desktop-tutorial(repository) = In terminal of VScode
          PS D:\Git_learning> cd desktop-tutorial                                                          
          PS D:\Git_learning\desktop-tutorial> 
        Step 2: -> use git status command to see the untracked files(files that are not available in git repositoryg)
          PS D:\Git_learning\desktop-tutorial> git status
          On branch main
          Your branch is up to date with 'origin/main'.

          Untracked files:
              (use "git add <file>..." to include in what will be committed)
             Import_to_Git.java

            nothing added to commit but untracked files present (use "git add" to track)

        Step 3:   -> git add Import_to_Git.java
          use git add command and "file name" .Thus file will be added to git repository.
          git 
        Step 4: -> Now check the git status 
             PS D:\Git_learning\desktop-tutorial> git status       
             branch main
             Your branch is up to date with 'origin/main'.

            Changes to be committed:
                    (use "git restore --staged <file>..." to unstage)
                     modified:   Demo.java
                     new file:   Import_to_Git.java

        Step 5:  git commit -m("FIle is added") ===> use this command-("file is added")is message,you can use any text over there
        o/p: 
             PS D:\Git_learning\desktop-tutorial> git commit -m("File is added")
             [main d76ed7b] File is added
             2 files changed, 51 insertions(+)
             create mode 100644 Import_to_Git.java
        Step 6:  git push origin main
        o/p:  
                 PS D:\Git_learning\desktop-tutorial> git push origin main          
                 info: please complete authentication in your browser...
                 Enumerating objects: 6, done.
                 Counting objects: 100% (6/6), done.
                 Delta compression using up to 12 threads
                Compressing objects: 100% (4/4), done.
                Writing objects: 100% (4/4), 1.41 KiB | 480.00 KiB/s, done.
                Total 4 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
                To https://github.com/Aswinmayak/desktop-tutorial.git
                 60dc186..d76ed7b  main -> main


           */
    }
}
