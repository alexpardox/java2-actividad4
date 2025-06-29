# Instrucciones de Despliegue en GlassFish

## Requisitos Previos
- GlassFish Server instalado y funcionando
- Java 17 configurado
- Puerto 8080 disponible (o el puerto que hayas configurado en GlassFish)

## Pasos para Desplegar

### 1. Generar el archivo WAR
```bash
./mvnw clean package
```

### 2. Desplegar en GlassFish

#### Opción A: Usando la Consola de Administración
1. Accede a la consola de administración de GlassFish (generalmente en http://localhost:4848)
2. Ve a "Applications" en el panel izquierdo
3. Haz clic en "Deploy..."
4. Selecciona el archivo `target/actividad4-0.0.1-SNAPSHOT.war`
5. Especifica el Context Root como `/actividad4` (opcional)
6. Haz clic en "OK" para desplegar

#### Opción B: Usando la línea de comandos
```bash
asadmin deploy target/actividad4-0.0.1-SNAPSHOT.war
```

#### Opción C: Deploy automático (hot deployment)
Copia el archivo WAR a la carpeta `autodeploy` de GlassFish:
```bash
cp target/actividad4-0.0.1-SNAPSHOT.war $GLASSFISH_HOME/domains/domain1/autodeploy/
```

### 3. Verificar el Despliegue
- Accede a: http://localhost:8080/actividad4-0.0.1-SNAPSHOT/
- Deberías ver: "¡Hola desde Spring Boot en GlassFish!"
- También puedes verificar: http://localhost:8080/actividad4-0.0.1-SNAPSHOT/health

## Comandos Útiles de GlassFish

### Ver aplicaciones desplegadas:
```bash
asadmin list-applications
```

### Parar una aplicación:
```bash
asadmin disable actividad4-0.0.1-SNAPSHOT
```

### Iniciar una aplicación:
```bash
asadmin enable actividad4-0.0.1-SNAPSHOT
```

### Redesplegar:
```bash
asadmin redeploy target/actividad4-0.0.1-SNAPSHOT.war
```

### Eliminar aplicación:
```bash
asadmin undeploy actividad4-0.0.1-SNAPSHOT
```

## Notas Importantes
- El archivo WAR se genera en la carpeta `target/`
- El archivo `.war.original` es el WAR sin Spring Boot, el archivo `.war` es el ejecutable con Spring Boot embebido
- Para GlassFish, usa el archivo `.war` principal (no el .original)
- Si cambias la configuración, recuerda recompilar con `./mvnw clean package`
