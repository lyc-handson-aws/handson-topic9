{{/* yuanchao handson labels */}}
{{- define "handson.labels" -}}
yuanchaoaws: {{ .Values.handsontopic }}
date: {{ now | htmlDate }}
app: {{ .Values.app.name }}
env: {{ .Values.app.env }}
{{- end -}}
