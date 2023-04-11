echo "Inicio da instalação"
sudo apt-get install mailutils
echo "Fim da instalação"
mail -s "Pipeline executado" ${EMAIL}