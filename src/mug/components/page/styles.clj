(ns mug.components.page.styles)

(def defaults
  [[:.page {:display  "table"
            :position "static"
            :width    "100%"
            :height   "100%"}]
   [:.page-row {:display "table-row"
                :width   "100%"}]
   [:.page-cell {:display "table-cell"
                 :width   "100%"}]
   [:.page-content {:background-color "red"
                    :max-height "100%"
                    :overflow-y "auto"}]])