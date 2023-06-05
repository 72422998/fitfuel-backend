# Fitfuel

---

Proyecto de acesoria en nutricion online

Comando para crear una rama secundaria

```cmd
git branch (nombre)
```

---

Cambio de rama principal a secundaria
```cmd
git checkout (nombre)
```

---
Cambio de rama secundaria a principal
```cmd
git checkout main
```

Ejecutar servidor local
```cmd
npm run dev
```

Deshacer todos los cambios realizados en un archivo especifico y restaurarlo al estado del ultimo commit
```cmd
git checkout -- {nombre del archivo}
```

Deshacer todos los cambios realizados en todos los archivos y volver al estado del ultimo commit
```cmd
git checkout -- .
```

Visualizar ramas remotas
```
git branch -r
```

Crear una rama local para cada rama remota que se desee traer
```cmd
git checkout -b {nombre_de_rama_local origin/nombre_de_rama_remota}
```

Eliminar branch
```cmd
git branch -d {nombre de rama}
```