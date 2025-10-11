# Troubleshooting (Windows, PowerShell, Java)

## Error: illegal character: '\ufeff'
Causa: archivo .java guardado con BOM en UTF-8 (Windows).

### Solución rápida
- Reescribir el archivo sin BOM (UTF-8) o configurar el editor para guardar sin BOM.
- Evitar mezclar CRLF/LF en .java.

## Notas
- Capturas y evidencias en /docs.
- Build con Maven y Java 17.
