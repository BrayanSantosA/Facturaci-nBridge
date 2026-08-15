# Facturación usando el patrón de diseño Bridge
## UML inicial
<img width="1183" height="1600" alt="image" src="https://github.com/user-attachments/assets/eba97a2e-9643-42a5-a286-66d2c4a4f10d" />

## Salida en pantalla
<img width="535" height="443" alt="image" src="https://github.com/user-attachments/assets/0cae58b8-8641-4285-a024-ae5c2eda2882" />

## Respuesta de análisis

Para agregar el formato EDI solo hace falta crear una nueva clase, `ExportadorEDI`, que implemente la interfaz `ExportadorFormato`. Esta operación no requiere tocar `Comprobante` ni ninguna de sus cuatro subclases porque la abstracción solo conoce el contrato `ExportadorFormato`, no sus implementaciones concretas: la composición inyectada por constructor desacopla completamente el eje de "qué tipo de comprobante es" del eje de "en qué formato se exporta".
