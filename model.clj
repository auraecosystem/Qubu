(require '[clj-http.client :as client])

(client/post "https://qubu.ai/api/v1/chat/completions" {:headers {:Authorization "Bearer d369192cb0dc2c4fbba6c17d153fbaeb5056a9c1
                                                                                "}
                                                        :content-type :json
                                                        :form-params {:model "gpt-5-5:chat"
                                                                      :messages [{:role ""
                                                                                  :content nil}]
                                                                      :tools []
                                                                      :tool_choice nil
                                                                      :response_format nil
                                                                      :reasoning_effort "low"
                                                                      :temperature 1
                                                                      :max_tokens 1
                                                                      :top_p 1
                                                                      :stream true}
                                                        :accept :json})
