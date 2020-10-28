echo "** ls -la ***"
ls -la

echo "** git status ***"
git status

echo "** git add . ***"
git add .

read -p "Enter comment : " comment

echo "** git commit -m $comment ***"
git commit -m "$comment"

echo "** push ***"
git push