(ns cljs-benchmarks.benchmarks.write-data
  (:require
    [clojure.walk :as walk]
    [fipp.edn :as fipp]
    [cljs.reader :as reader]
    [cognitect.transit :as transit]
    [hoplon.core :as h :refer [defelem case-tpl cond-tpl for-tpl if-tpl when-tpl]]
    [hoplon.jquery]
    [hoplon.spectre-css :as s]
    [javelin.core :as j :refer [cell] :refer-macros [cell= defc defc=]]))

(defonce results
  (cell nil))

(def transit-reader-json*
  (transit/reader :json))

(def transit-writer-json*
  (transit/writer :json))

(def transit-writer-json-verbose*
  (transit/writer :json-verbose))

(defn transit-reader
  [transit-string]
  (transit/read transit-reader-json* transit-string))

(defn transit-writer
  [data]
  (transit/write transit-writer-json* data))

(defn transit-verbose-writer
  [data]
  (transit/write transit-writer-json-verbose* data))

(defn edn-writer
  [data]
  (pr-str data))

(defn edn-reader
  [edn-string]
  (reader/read-string edn-string))

(defn json-writer
  [data]
  (js/JSON.stringify (clj->js data)))

(defn json-reader
  [json-string]
  (js->clj (js/JSON.parse json-string)))

(defn json-reader-kw
  [json-string]
  (js->clj (js/JSON.parse json-string) :keywordize-keys true))

(defn run-write-benchmark
  [data* results type k]
  (let [data (get data* k)
        str-keys-data (walk/stringify-keys data)
        json-data-kw (json-writer data)
        suite (js/Benchmark.Suite.)]
    (swap! results assoc-in [type :running k] true)
    (doto suite
      (.add "transit" (fn [] (transit-writer data)))
      (.add "transit-verbose" (fn [] (transit-verbose-writer str-keys-data)))
      (.add "edn" (fn [] (edn-writer data)))
      (.add "json" (fn [] (json-writer str-keys-data)))
      (.add "json-kw" (fn [] (json-writer data)))
      (.on "cycle" (fn [event]
                     (swap! results assoc-in [type k event.target.name] (let [result event.target]
                                                                          {:name (.-name result)
                                                                           :ops-sec (js/Math.floor (.-hz result))
                                                                           :rme (.toFixed (.-rme (.-stats result)) 2)
                                                                           :samples (.-length (.-sample (.-stats result)))}))))
      (.on "complete" (fn [] (swap! results assoc-in [type :running k] false)))
      (.run #js {:async true}))))

(def data
  {:d0 ["ok"]
   :d1 {:result "ok"}
   :d2 [{:email "ex@example.com",
         :primary true,
         :verified true,
         :visibility "public"}
        {:email "example@example.com",
         :primary false,
         :verified true,
         :visibility nil}]
   :d3 {:html_url "https://github.com/mynomoto",
        :disk_usage 7251,
        :gravatar_id "",
        :followers_url "https://api.github.com/users/mynomoto/followers",
        :subscriptions_url "https://api.github.com/users/mynomoto/subscriptions",
        :owned_private_repos 0,
        :site_admin false,
        :email nil,
        :following_url "https://api.github.com/users/mynomoto/following{/other_user}",
        :hireable nil,
        :name "Marcelo Nomoto",
        :type "User",
        :received_events_url "https://api.github.com/users/mynomoto/received_events",
        :private_gists 11,
        :login "mynomoto",
        :following 0,
        :updated_at "2017-02-13T19:46:20Z",
        :collaborators 0,
        :bio nil,
        :organizations_url "https://api.github.com/users/mynomoto/orgs",
        :id 178872,
        :events_url "https://api.github.com/users/mynomoto/events{/privacy}",
        :url "https://api.github.com/users/mynomoto",
        :public_gists 5,
        :repos_url "https://api.github.com/users/mynomoto/repos",
        :two_factor_authentication true,
        :public_repos 33,
        :total_private_repos 0,
        :starred_url "https://api.github.com/users/mynomoto/starred{/owner}{/repo}",
        :plan {:name "free", :space 976562499, :collaborators 0, :private_repos 0},
        :location nil,
        :blog nil,
        :followers 11,
        :company nil,
        :gists_url "https://api.github.com/users/mynomoto/gists{/gist_id}",
        :created_at "2010-01-09T00:48:47Z",
        :avatar_url "https://avatars.githubusercontent.com/u/178872?v=3"}
   :d5 {:cactus "https://assets-cdn.github.com/images/icons/emoji/unicode/1f335.png?v7",
        :djibouti "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e9-1f1ef.png?v7",
        :arrow_up "https://assets-cdn.github.com/images/icons/emoji/unicode/2b06.png?v7",
        :pouch "https://assets-cdn.github.com/images/icons/emoji/unicode/1f45d.png?v7",
        :satellite "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4e1.png?v7",
        :sweet_potato "https://assets-cdn.github.com/images/icons/emoji/unicode/1f360.png?v7",
        :old_key "https://assets-cdn.github.com/images/icons/emoji/unicode/1f5dd.png?v7",
        :fr "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1eb-1f1f7.png?v7",
        :st_lucia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f1-1f1e8.png?v7",
        :station "https://assets-cdn.github.com/images/icons/emoji/unicode/1f689.png?v7",
        :moon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f314.png?v7",
        :grenada "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ec-1f1e9.png?v7",
        :rage "https://assets-cdn.github.com/images/icons/emoji/unicode/1f621.png?v7",
        :right_anger_bubble "https://assets-cdn.github.com/images/icons/emoji/unicode/1f5ef.png?v7",
        :metal "https://assets-cdn.github.com/images/icons/emoji/unicode/1f918.png?v7",
        :cameroon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e8-1f1f2.png?v7",
        :books "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4da.png?v7",
        :zero "https://assets-cdn.github.com/images/icons/emoji/unicode/0030-20e3.png?v7",
        :french_southern_territories "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f9-1f1eb.png?v7",
        :ribbon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f380.png?v7",
        :baggage_claim "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6c4.png?v7",
        :man_with_turban "https://assets-cdn.github.com/images/icons/emoji/unicode/1f473.png?v7",
        :mag_right "https://assets-cdn.github.com/images/icons/emoji/unicode/1f50e.png?v7",
        :st_pierre_miquelon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f5-1f1f2.png?v7",
        :hospital "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3e5.png?v7",
        :cote_divoire "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e8-1f1ee.png?v7",
        :fire "https://assets-cdn.github.com/images/icons/emoji/unicode/1f525.png?v7",
        :swimming_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3ca.png?v7",
        :ice_skate "https://assets-cdn.github.com/images/icons/emoji/unicode/26f8.png?v7",
        :aries "https://assets-cdn.github.com/images/icons/emoji/unicode/2648.png?v7",
        :triumph "https://assets-cdn.github.com/images/icons/emoji/unicode/1f624.png?v7",
        :one "https://assets-cdn.github.com/images/icons/emoji/unicode/0031-20e3.png?v7",
        :large_blue_circle "https://assets-cdn.github.com/images/icons/emoji/unicode/1f535.png?v7",
        :full_moon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f315.png?v7",
        :frowning_face "https://assets-cdn.github.com/images/icons/emoji/unicode/2639.png?v7",
        :crossed_flags "https://assets-cdn.github.com/images/icons/emoji/unicode/1f38c.png?v7",
        :hotsprings "https://assets-cdn.github.com/images/icons/emoji/unicode/2668.png?v7",
        :strawberry "https://assets-cdn.github.com/images/icons/emoji/unicode/1f353.png?v7",
        :white_small_square "https://assets-cdn.github.com/images/icons/emoji/unicode/25ab.png?v7",
        :hammer_and_pick "https://assets-cdn.github.com/images/icons/emoji/unicode/2692.png?v7",
        :balloon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f388.png?v7",
        :eagle "https://assets-cdn.github.com/images/icons/emoji/unicode/1f985.png?v7",
        :eight_spoked_asterisk "https://assets-cdn.github.com/images/icons/emoji/unicode/2733.png?v7",
        :hong_kong "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ed-1f1f0.png?v7",
        :cold_sweat "https://assets-cdn.github.com/images/icons/emoji/unicode/1f630.png?v7",
        :mountain_cableway "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6a0.png?v7",
        :no_good "https://assets-cdn.github.com/images/icons/emoji/unicode/1f645.png?v7",
        :printer "https://assets-cdn.github.com/images/icons/emoji/unicode/1f5a8.png?v7",
        :video_camera "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4f9.png?v7",
        :mask "https://assets-cdn.github.com/images/icons/emoji/unicode/1f637.png?v7",
        :couplekiss_man_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f48f.png?v7",
        :martinique "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f2-1f1f6.png?v7",
        :electric_plug "https://assets-cdn.github.com/images/icons/emoji/unicode/1f50c.png?v7",
        :goat "https://assets-cdn.github.com/images/icons/emoji/unicode/1f410.png?v7",
        :rice_ball "https://assets-cdn.github.com/images/icons/emoji/unicode/1f359.png?v7",
        :crescent_moon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f319.png?v7",
        :man_juggling "https://assets-cdn.github.com/images/icons/emoji/unicode/1f939-2642.png?v7",
        :tv "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4fa.png?v7",
        :record_button "https://assets-cdn.github.com/images/icons/emoji/unicode/23fa.png?v7",
        :cat "https://assets-cdn.github.com/images/icons/emoji/unicode/1f431.png?v7",
        :vanuatu "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1fb-1f1fa.png?v7",
        :keyboard "https://assets-cdn.github.com/images/icons/emoji/unicode/2328.png?v7",
        :eggplant "https://assets-cdn.github.com/images/icons/emoji/unicode/1f346.png?v7",
        :woman_astronaut "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f680.png?v7",
        :volcano "https://assets-cdn.github.com/images/icons/emoji/unicode/1f30b.png?v7",
        :brunei "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e7-1f1f3.png?v7",
        :black_large_square "https://assets-cdn.github.com/images/icons/emoji/unicode/2b1b.png?v7",
        :blue_book "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4d8.png?v7",
        :hungary "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ed-1f1fa.png?v7",
        :guadeloupe "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ec-1f1f5.png?v7",
        :heavy_minus_sign "https://assets-cdn.github.com/images/icons/emoji/unicode/2796.png?v7",
        :capital_abcd "https://assets-cdn.github.com/images/icons/emoji/unicode/1f520.png?v7",
        :four_leaf_clover "https://assets-cdn.github.com/images/icons/emoji/unicode/1f340.png?v7",
        :paperclip "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4ce.png?v7",
        :new_caledonia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f3-1f1e8.png?v7",
        :crossed_fingers "https://assets-cdn.github.com/images/icons/emoji/unicode/1f91e.png?v7",
        :canoe "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6f6.png?v7",
        :bowing_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f647.png?v7",
        :stew "https://assets-cdn.github.com/images/icons/emoji/unicode/1f372.png?v7",
        :balance_scale "https://assets-cdn.github.com/images/icons/emoji/unicode/2696.png?v7",
        :rice "https://assets-cdn.github.com/images/icons/emoji/unicode/1f35a.png?v7",
        :oncoming_police_car "https://assets-cdn.github.com/images/icons/emoji/unicode/1f694.png?v7",
        :neutral_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f610.png?v7",
        :no_smoking "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6ad.png?v7",
        :fist_right "https://assets-cdn.github.com/images/icons/emoji/unicode/1f91c.png?v7",
        :haircut "https://assets-cdn.github.com/images/icons/emoji/unicode/1f487.png?v7",
        :raised_back_of_hand "https://assets-cdn.github.com/images/icons/emoji/unicode/1f91a.png?v7",
        :tropical_fish "https://assets-cdn.github.com/images/icons/emoji/unicode/1f420.png?v7",
        :aquarius "https://assets-cdn.github.com/images/icons/emoji/unicode/2652.png?v7",
        :sunny "https://assets-cdn.github.com/images/icons/emoji/unicode/2600.png?v7",
        :speaking_head "https://assets-cdn.github.com/images/icons/emoji/unicode/1f5e3.png?v7",
        :yin_yang "https://assets-cdn.github.com/images/icons/emoji/unicode/262f.png?v7",
        :point_left "https://assets-cdn.github.com/images/icons/emoji/unicode/1f448.png?v7",
        :sound "https://assets-cdn.github.com/images/icons/emoji/unicode/1f509.png?v7",
        :desktop_computer "https://assets-cdn.github.com/images/icons/emoji/unicode/1f5a5.png?v7",
        :stuck_out_tongue "https://assets-cdn.github.com/images/icons/emoji/unicode/1f61b.png?v7",
        :man_singer "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f3a4.png?v7",
        :woman_scientist "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f52c.png?v7",
        :package "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4e6.png?v7",
        :ok_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f646.png?v7",
        :sun_behind_rain_cloud "https://assets-cdn.github.com/images/icons/emoji/unicode/1f326.png?v7",
        :family_woman_woman_boy_boy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f469-1f466-1f466.png?v7",
        :colombia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e8-1f1f4.png?v7",
        :man_in_tuxedo "https://assets-cdn.github.com/images/icons/emoji/unicode/1f935.png?v7",
        :bow_and_arrow "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3f9.png?v7",
        :armenia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e6-1f1f2.png?v7",
        :curacao "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e8-1f1fc.png?v7",
        :asterisk "https://assets-cdn.github.com/images/icons/emoji/unicode/002a-20e3.png?v7",
        :family_man_girl "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f467.png?v7",
        :fax "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4e0.png?v7",
        :orange "https://assets-cdn.github.com/images/icons/emoji/unicode/1f34a.png?v7",
        :couplekiss_woman_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-2764-1f48b-1f469.png?v7",
        :ledger "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4d2.png?v7",
        :cloud_with_lightning "https://assets-cdn.github.com/images/icons/emoji/unicode/1f329.png?v7",
        :first_quarter_moon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f313.png?v7",
        :hurtrealbad "https://assets-cdn.github.com/images/icons/emoji/hurtrealbad.png?v7",
        :ice_cream "https://assets-cdn.github.com/images/icons/emoji/unicode/1f368.png?v7",
        :email "https://assets-cdn.github.com/images/icons/emoji/unicode/2709.png?v7",
        :lying_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f925.png?v7",
        :dominica "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e9-1f1f2.png?v7",
        :police_car "https://assets-cdn.github.com/images/icons/emoji/unicode/1f693.png?v7",
        :biohazard "https://assets-cdn.github.com/images/icons/emoji/unicode/2623.png?v7",
        :godmode "https://assets-cdn.github.com/images/icons/emoji/godmode.png?v7",
        :envelope "https://assets-cdn.github.com/images/icons/emoji/unicode/2709.png?v7",
        :hugs "https://assets-cdn.github.com/images/icons/emoji/unicode/1f917.png?v7",
        :orthodox_cross "https://assets-cdn.github.com/images/icons/emoji/unicode/2626.png?v7",
        :mailbox_with_no_mail "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4ed.png?v7",
        :hourglass_flowing_sand "https://assets-cdn.github.com/images/icons/emoji/unicode/23f3.png?v7",
        :candy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f36c.png?v7",
        :guardswoman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f482-2640.png?v7",
        :non-potable_water "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6b1.png?v7",
        :british_indian_ocean_territory "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ee-1f1f4.png?v7",
        :date "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4c5.png?v7",
        :traffic_light "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6a5.png?v7",
        :evergreen_tree "https://assets-cdn.github.com/images/icons/emoji/unicode/1f332.png?v7",
        :papua_new_guinea "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f5-1f1ec.png?v7",
        :bee "https://assets-cdn.github.com/images/icons/emoji/unicode/1f41d.png?v7",
        :dagger "https://assets-cdn.github.com/images/icons/emoji/unicode/1f5e1.png?v7",
        :panda_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f43c.png?v7",
        :barber "https://assets-cdn.github.com/images/icons/emoji/unicode/1f488.png?v7",
        :worried "https://assets-cdn.github.com/images/icons/emoji/unicode/1f61f.png?v7",
        :closed_umbrella "https://assets-cdn.github.com/images/icons/emoji/unicode/1f302.png?v7",
        :leo "https://assets-cdn.github.com/images/icons/emoji/unicode/264c.png?v7",
        :kenya "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f0-1f1ea.png?v7",
        :algeria "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e9-1f1ff.png?v7",
        :pray "https://assets-cdn.github.com/images/icons/emoji/unicode/1f64f.png?v7",
        :bowling "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3b3.png?v7",
        :abc "https://assets-cdn.github.com/images/icons/emoji/unicode/1f524.png?v7",
        :exclamation "https://assets-cdn.github.com/images/icons/emoji/unicode/2757.png?v7",
        :duck "https://assets-cdn.github.com/images/icons/emoji/unicode/1f986.png?v7",
        :heart_eyes_cat "https://assets-cdn.github.com/images/icons/emoji/unicode/1f63b.png?v7",
        :point_right "https://assets-cdn.github.com/images/icons/emoji/unicode/1f449.png?v7",
        :bird "https://assets-cdn.github.com/images/icons/emoji/unicode/1f426.png?v7",
        :sunflower "https://assets-cdn.github.com/images/icons/emoji/unicode/1f33b.png?v7",
        :antarctica "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e6-1f1f6.png?v7",
        :fries "https://assets-cdn.github.com/images/icons/emoji/unicode/1f35f.png?v7",
        :singapore "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f8-1f1ec.png?v7",
        :microscope "https://assets-cdn.github.com/images/icons/emoji/unicode/1f52c.png?v7",
        :sparkles "https://assets-cdn.github.com/images/icons/emoji/unicode/2728.png?v7",
        :mrs_claus "https://assets-cdn.github.com/images/icons/emoji/unicode/1f936.png?v7",
        :stop_sign "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6d1.png?v7",
        :es "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ea-1f1f8.png?v7",
        :camping "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3d5.png?v7",
        :dancer "https://assets-cdn.github.com/images/icons/emoji/unicode/1f483.png?v7",
        :card_file_box "https://assets-cdn.github.com/images/icons/emoji/unicode/1f5c3.png?v7",
        :women_wrestling "https://assets-cdn.github.com/images/icons/emoji/unicode/1f93c-2640.png?v7",
        :seychelles "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f8-1f1e8.png?v7",
        :sleeping_bed "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6cc.png?v7",
        :heart_decoration "https://assets-cdn.github.com/images/icons/emoji/unicode/1f49f.png?v7",
        :busts_in_silhouette "https://assets-cdn.github.com/images/icons/emoji/unicode/1f465.png?v7",
        :senegal "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f8-1f1f3.png?v7",
        :heart "https://assets-cdn.github.com/images/icons/emoji/unicode/2764.png?v7",
        :smiley_cat "https://assets-cdn.github.com/images/icons/emoji/unicode/1f63a.png?v7",
        :joystick "https://assets-cdn.github.com/images/icons/emoji/unicode/1f579.png?v7",
        :cowboy_hat_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f920.png?v7",
        :man_mechanic "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f527.png?v7",
        :bellhop_bell "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6ce.png?v7",
        :handshake "https://assets-cdn.github.com/images/icons/emoji/unicode/1f91d.png?v7",
        :spades "https://assets-cdn.github.com/images/icons/emoji/unicode/2660.png?v7",
        :fearful "https://assets-cdn.github.com/images/icons/emoji/unicode/1f628.png?v7",
        :family_man_girl_girl "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f467-1f467.png?v7",
        :eyes "https://assets-cdn.github.com/images/icons/emoji/unicode/1f440.png?v7",
        :suspension_railway "https://assets-cdn.github.com/images/icons/emoji/unicode/1f69f.png?v7",
        :black_medium_small_square "https://assets-cdn.github.com/images/icons/emoji/unicode/25fe.png?v7",
        :moneybag "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4b0.png?v7",
        :family_man_man_boy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f468-1f466.png?v7",
        :palm_tree "https://assets-cdn.github.com/images/icons/emoji/unicode/1f334.png?v7",
        :keycap_ten "https://assets-cdn.github.com/images/icons/emoji/unicode/1f51f.png?v7",
        :tokelau "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f9-1f1f0.png?v7",
        :raising_hand_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f64b-2642.png?v7",
        :wink "https://assets-cdn.github.com/images/icons/emoji/unicode/1f609.png?v7",
        :medal_military "https://assets-cdn.github.com/images/icons/emoji/unicode/1f396.png?v7",
        :family "https://assets-cdn.github.com/images/icons/emoji/unicode/1f46a.png?v7",
        :azerbaijan "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e6-1f1ff.png?v7",
        :hatching_chick "https://assets-cdn.github.com/images/icons/emoji/unicode/1f423.png?v7",
        :wilted_flower "https://assets-cdn.github.com/images/icons/emoji/unicode/1f940.png?v7",
        :hushed "https://assets-cdn.github.com/images/icons/emoji/unicode/1f62f.png?v7",
        :gemini "https://assets-cdn.github.com/images/icons/emoji/unicode/264a.png?v7",
        :man_artist "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f3a8.png?v7",
        :belarus "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e7-1f1fe.png?v7",
        :zap "https://assets-cdn.github.com/images/icons/emoji/unicode/26a1.png?v7",
        :satisfied "https://assets-cdn.github.com/images/icons/emoji/unicode/1f606.png?v7",
        :partly_sunny "https://assets-cdn.github.com/images/icons/emoji/unicode/26c5.png?v7",
        :bookmark "https://assets-cdn.github.com/images/icons/emoji/unicode/1f516.png?v7",
        :hash "https://assets-cdn.github.com/images/icons/emoji/unicode/0023-20e3.png?v7",
        :bullettrain_front "https://assets-cdn.github.com/images/icons/emoji/unicode/1f685.png?v7",
        :loudspeaker "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4e2.png?v7",
        :vibration_mode "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4f3.png?v7",
        :underage "https://assets-cdn.github.com/images/icons/emoji/unicode/1f51e.png?v7",
        :tennis "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3be.png?v7",
        :small_red_triangle "https://assets-cdn.github.com/images/icons/emoji/unicode/1f53a.png?v7",
        :sweat_smile "https://assets-cdn.github.com/images/icons/emoji/unicode/1f605.png?v7",
        :sagittarius "https://assets-cdn.github.com/images/icons/emoji/unicode/2650.png?v7",
        :classical_building "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3db.png?v7",
        :last_quarter_moon_with_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f31c.png?v7",
        :rowing_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6a3-2640.png?v7",
        :eight "https://assets-cdn.github.com/images/icons/emoji/unicode/0038-20e3.png?v7",
        :wind_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f32c.png?v7",
        :woman_cook "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f373.png?v7",
        :eyeglasses "https://assets-cdn.github.com/images/icons/emoji/unicode/1f453.png?v7",
        :shamrock "https://assets-cdn.github.com/images/icons/emoji/unicode/2618.png?v7",
        :bowtie "https://assets-cdn.github.com/images/icons/emoji/bowtie.png?v7",
        :french_polynesia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f5-1f1eb.png?v7",
        :smirk "https://assets-cdn.github.com/images/icons/emoji/unicode/1f60f.png?v7",
        :car "https://assets-cdn.github.com/images/icons/emoji/unicode/1f697.png?v7",
        :astonished "https://assets-cdn.github.com/images/icons/emoji/unicode/1f632.png?v7",
        :racing_car "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3ce.png?v7",
        :japanese_castle "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3ef.png?v7",
        :chart_with_upwards_trend "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4c8.png?v7",
        :family_man_man_girl_boy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f468-1f467-1f466.png?v7",
        :ambulance "https://assets-cdn.github.com/images/icons/emoji/unicode/1f691.png?v7",
        :bear "https://assets-cdn.github.com/images/icons/emoji/unicode/1f43b.png?v7",
        :foggy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f301.png?v7",
        :smiling_imp "https://assets-cdn.github.com/images/icons/emoji/unicode/1f608.png?v7",
        :cool "https://assets-cdn.github.com/images/icons/emoji/unicode/1f192.png?v7",
        :guernsey "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ec-1f1ec.png?v7",
        :helicopter "https://assets-cdn.github.com/images/icons/emoji/unicode/1f681.png?v7",
        :dizzy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4ab.png?v7",
        :full_moon_with_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f31d.png?v7",
        :blonde_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f471.png?v7",
        :currency_exchange "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4b1.png?v7",
        :golfing_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3cc.png?v7",
        :baguette_bread "https://assets-cdn.github.com/images/icons/emoji/unicode/1f956.png?v7",
        :namibia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f3-1f1e6.png?v7",
        :older_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f475.png?v7",
        :arrow_up_down "https://assets-cdn.github.com/images/icons/emoji/unicode/2195.png?v7",
        :family_woman_girl_girl "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f467-1f467.png?v7",
        :oncoming_taxi "https://assets-cdn.github.com/images/icons/emoji/unicode/1f696.png?v7",
        :stuck_out_tongue_winking_eye "https://assets-cdn.github.com/images/icons/emoji/unicode/1f61c.png?v7",
        :computer "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4bb.png?v7",
        :netherlands "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f3-1f1f1.png?v7",
        :cl "https://assets-cdn.github.com/images/icons/emoji/unicode/1f191.png?v7",
        :south_africa "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ff-1f1e6.png?v7",
        :octopus "https://assets-cdn.github.com/images/icons/emoji/unicode/1f419.png?v7",
        :slightly_frowning_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f641.png?v7",
        :open_hands "https://assets-cdn.github.com/images/icons/emoji/unicode/1f450.png?v7",
        :pancakes "https://assets-cdn.github.com/images/icons/emoji/unicode/1f95e.png?v7",
        :key "https://assets-cdn.github.com/images/icons/emoji/unicode/1f511.png?v7",
        :frowning_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f64d.png?v7",
        :congo_kinshasa "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e8-1f1e9.png?v7",
        :red_circle "https://assets-cdn.github.com/images/icons/emoji/unicode/1f534.png?v7",
        :cocos_islands "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e8-1f1e8.png?v7",
        :flight_departure "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6eb.png?v7",
        :nauseated_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f922.png?v7",
        :woman_teacher "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f3eb.png?v7",
        :anguilla "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e6-1f1ee.png?v7",
        :mobile_phone_off "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4f4.png?v7",
        :arrow_right_hook "https://assets-cdn.github.com/images/icons/emoji/unicode/21aa.png?v7",
        :oncoming_bus "https://assets-cdn.github.com/images/icons/emoji/unicode/1f68d.png?v7",
        :australia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e6-1f1fa.png?v7",
        :gift_heart "https://assets-cdn.github.com/images/icons/emoji/unicode/1f49d.png?v7",
        :punch "https://assets-cdn.github.com/images/icons/emoji/unicode/1f44a.png?v7",
        :clown_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f921.png?v7",
        :alien "https://assets-cdn.github.com/images/icons/emoji/unicode/1f47d.png?v7",
        :surfing_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3c4-2640.png?v7",
        :black_joker "https://assets-cdn.github.com/images/icons/emoji/unicode/1f0cf.png?v7",
        :liberia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f1-1f1f7.png?v7",
        :alembic "https://assets-cdn.github.com/images/icons/emoji/unicode/2697.png?v7",
        :clapper "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3ac.png?v7",
        :lion "https://assets-cdn.github.com/images/icons/emoji/unicode/1f981.png?v7",
        :lesotho "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f1-1f1f8.png?v7",
        :ring "https://assets-cdn.github.com/images/icons/emoji/unicode/1f48d.png?v7",
        :montserrat "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f2-1f1f8.png?v7",
        :beer "https://assets-cdn.github.com/images/icons/emoji/unicode/1f37a.png?v7",
        :kuwait "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f0-1f1fc.png?v7",
        :disappointed "https://assets-cdn.github.com/images/icons/emoji/unicode/1f61e.png?v7",
        :poop "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4a9.png?v7",
        :purple_heart "https://assets-cdn.github.com/images/icons/emoji/unicode/1f49c.png?v7",
        :mountain_biking_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6b5.png?v7",
        :bat "https://assets-cdn.github.com/images/icons/emoji/unicode/1f987.png?v7",
        :new_moon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f311.png?v7",
        :raising_hand_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f64b.png?v7",
        :potato "https://assets-cdn.github.com/images/icons/emoji/unicode/1f954.png?v7",
        :snake "https://assets-cdn.github.com/images/icons/emoji/unicode/1f40d.png?v7",
        :squid "https://assets-cdn.github.com/images/icons/emoji/unicode/1f991.png?v7",
        :united_arab_emirates "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e6-1f1ea.png?v7",
        :macedonia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f2-1f1f0.png?v7",
        :diamonds "https://assets-cdn.github.com/images/icons/emoji/unicode/2666.png?v7",
        :high_heel "https://assets-cdn.github.com/images/icons/emoji/unicode/1f460.png?v7",
        :radio "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4fb.png?v7",
        :man_playing_handball "https://assets-cdn.github.com/images/icons/emoji/unicode/1f93e-2642.png?v7",
        :cherry_blossom "https://assets-cdn.github.com/images/icons/emoji/unicode/1f338.png?v7",
        :vulcan_salute "https://assets-cdn.github.com/images/icons/emoji/unicode/1f596.png?v7",
        :argentina "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e6-1f1f7.png?v7",
        :zimbabwe "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ff-1f1fc.png?v7",
        :construction "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6a7.png?v7",
        :avocado "https://assets-cdn.github.com/images/icons/emoji/unicode/1f951.png?v7",
        :mag "https://assets-cdn.github.com/images/icons/emoji/unicode/1f50d.png?v7",
        :convenience_store "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3ea.png?v7",
        :shower "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6bf.png?v7",
        :roll_eyes "https://assets-cdn.github.com/images/icons/emoji/unicode/1f644.png?v7",
        :cricket "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3cf.png?v7",
        :white_flag "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3f3.png?v7",
        :no_pedestrians "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6b7.png?v7",
        :estonia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ea-1f1ea.png?v7",
        :put_litter_in_its_place "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6ae.png?v7",
        :bulgaria "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e7-1f1ec.png?v7",
        :school "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3eb.png?v7",
        :guyana "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ec-1f1fe.png?v7",
        :thought_balloon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4ad.png?v7",
        :black_circle "https://assets-cdn.github.com/images/icons/emoji/unicode/26ab.png?v7",
        :atom_symbol "https://assets-cdn.github.com/images/icons/emoji/unicode/269b.png?v7",
        :heavy_exclamation_mark "https://assets-cdn.github.com/images/icons/emoji/unicode/2757.png?v7",
        :montenegro "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f2-1f1ea.png?v7",
        :princess "https://assets-cdn.github.com/images/icons/emoji/unicode/1f478.png?v7",
        :man_firefighter "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f692.png?v7",
        :pout "https://assets-cdn.github.com/images/icons/emoji/unicode/1f621.png?v7",
        :desert_island "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3dd.png?v7",
        :st_kitts_nevis "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f0-1f1f3.png?v7",
        :man_health_worker "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-2695.png?v7",
        :san_marino "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f8-1f1f2.png?v7",
        :blue_car "https://assets-cdn.github.com/images/icons/emoji/unicode/1f699.png?v7",
        :niger "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f3-1f1ea.png?v7",
        :woman_playing_handball "https://assets-cdn.github.com/images/icons/emoji/unicode/1f93e-2640.png?v7",
        :coffin "https://assets-cdn.github.com/images/icons/emoji/unicode/26b0.png?v7",
        :top "https://assets-cdn.github.com/images/icons/emoji/unicode/1f51d.png?v7",
        :shoe "https://assets-cdn.github.com/images/icons/emoji/unicode/1f45e.png?v7",
        :malawi "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f2-1f1fc.png?v7",
        :point_up "https://assets-cdn.github.com/images/icons/emoji/unicode/261d.png?v7",
        :chains "https://assets-cdn.github.com/images/icons/emoji/unicode/26d3.png?v7",
        :green_salad "https://assets-cdn.github.com/images/icons/emoji/unicode/1f957.png?v7",
        :cinema "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3a6.png?v7",
        :morocco "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f2-1f1e6.png?v7",
        :doughnut "https://assets-cdn.github.com/images/icons/emoji/unicode/1f369.png?v7",
        :mantelpiece_clock "https://assets-cdn.github.com/images/icons/emoji/unicode/1f570.png?v7",
        :cyclone "https://assets-cdn.github.com/images/icons/emoji/unicode/1f300.png?v7",
        :kimono "https://assets-cdn.github.com/images/icons/emoji/unicode/1f458.png?v7",
        :construction_worker "https://assets-cdn.github.com/images/icons/emoji/unicode/1f477.png?v7",
        :bangbang "https://assets-cdn.github.com/images/icons/emoji/unicode/203c.png?v7",
        :coffee "https://assets-cdn.github.com/images/icons/emoji/unicode/2615.png?v7",
        :earth_asia "https://assets-cdn.github.com/images/icons/emoji/unicode/1f30f.png?v7",
        :mans_shoe "https://assets-cdn.github.com/images/icons/emoji/unicode/1f45e.png?v7",
        :phone "https://assets-cdn.github.com/images/icons/emoji/unicode/260e.png?v7",
        :philippines "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f5-1f1ed.png?v7",
        :mountain_biking_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6b5-2640.png?v7",
        :iphone "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4f1.png?v7",
        :hatched_chick "https://assets-cdn.github.com/images/icons/emoji/unicode/1f425.png?v7",
        :control_knobs "https://assets-cdn.github.com/images/icons/emoji/unicode/1f39b.png?v7",
        :shaved_ice "https://assets-cdn.github.com/images/icons/emoji/unicode/1f367.png?v7",
        :man_teacher "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f3eb.png?v7",
        :gun "https://assets-cdn.github.com/images/icons/emoji/unicode/1f52b.png?v7",
        :switzerland "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e8-1f1ed.png?v7",
        :night_with_stars "https://assets-cdn.github.com/images/icons/emoji/unicode/1f303.png?v7",
        :family_woman_woman_girl "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f469-1f467.png?v7",
        :massage "https://assets-cdn.github.com/images/icons/emoji/unicode/1f486.png?v7",
        :baby_chick "https://assets-cdn.github.com/images/icons/emoji/unicode/1f424.png?v7",
        :snowman_with_snow "https://assets-cdn.github.com/images/icons/emoji/unicode/2603.png?v7",
        :rooster "https://assets-cdn.github.com/images/icons/emoji/unicode/1f413.png?v7",
        :tonga "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f9-1f1f4.png?v7",
        :shield "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6e1.png?v7",
        :paw_prints "https://assets-cdn.github.com/images/icons/emoji/unicode/1f43e.png?v7",
        :fallen_leaf "https://assets-cdn.github.com/images/icons/emoji/unicode/1f342.png?v7",
        :restroom "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6bb.png?v7",
        :wheelchair "https://assets-cdn.github.com/images/icons/emoji/unicode/267f.png?v7",
        :green_book "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4d7.png?v7",
        :cop "https://assets-cdn.github.com/images/icons/emoji/unicode/1f46e.png?v7",
        :swimming_woman "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3ca-2640.png?v7",
        :telephone "https://assets-cdn.github.com/images/icons/emoji/unicode/260e.png?v7",
        :pick "https://assets-cdn.github.com/images/icons/emoji/unicode/26cf.png?v7",
        :confused "https://assets-cdn.github.com/images/icons/emoji/unicode/1f615.png?v7",
        :belgium "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e7-1f1ea.png?v7",
        :gb "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ec-1f1e7.png?v7",
        :frowning_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f64d-2642.png?v7",
        :gibraltar "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1ec-1f1ee.png?v7",
        :signal_strength "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4f6.png?v7",
        :free "https://assets-cdn.github.com/images/icons/emoji/unicode/1f193.png?v7",
        :railway_track "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6e4.png?v7",
        :new_moon_with_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f31a.png?v7",
        :central_african_republic "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e8-1f1eb.png?v7",
        :tshirt "https://assets-cdn.github.com/images/icons/emoji/unicode/1f455.png?v7",
        :rowing_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6a3.png?v7",
        :fire_engine "https://assets-cdn.github.com/images/icons/emoji/unicode/1f692.png?v7",
        :man_judge "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-2696.png?v7",
        :ukraine "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1fa-1f1e6.png?v7",
        :heartbeat "https://assets-cdn.github.com/images/icons/emoji/unicode/1f493.png?v7",
        :suriname "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f8-1f1f7.png?v7",
        :blowfish "https://assets-cdn.github.com/images/icons/emoji/unicode/1f421.png?v7",
        :middle_finger "https://assets-cdn.github.com/images/icons/emoji/unicode/1f595.png?v7",
        :new "https://assets-cdn.github.com/images/icons/emoji/unicode/1f195.png?v7",
        :white_circle "https://assets-cdn.github.com/images/icons/emoji/unicode/26aa.png?v7",
        :oil_drum "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6e2.png?v7",
        :aland_islands "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e6-1f1fd.png?v7",
        :candle "https://assets-cdn.github.com/images/icons/emoji/unicode/1f56f.png?v7",
        :fishing_pole_and_fish "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3a3.png?v7",
        :articulated_lorry "https://assets-cdn.github.com/images/icons/emoji/unicode/1f69b.png?v7",
        :couple_with_heart_woman_man "https://assets-cdn.github.com/images/icons/emoji/unicode/1f491.png?v7",
        :zipper_mouth_face "https://assets-cdn.github.com/images/icons/emoji/unicode/1f910.png?v7",
        :information_source "https://assets-cdn.github.com/images/icons/emoji/unicode/2139.png?v7",
        :burkina_faso "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e7-1f1eb.png?v7",
        :pill "https://assets-cdn.github.com/images/icons/emoji/unicode/1f48a.png?v7",
        :black_medium_square "https://assets-cdn.github.com/images/icons/emoji/unicode/25fc.png?v7",
        :mortar_board "https://assets-cdn.github.com/images/icons/emoji/unicode/1f393.png?v7",
        :chad "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f9-1f1e9.png?v7",
        :green_apple "https://assets-cdn.github.com/images/icons/emoji/unicode/1f34f.png?v7",
        :cd "https://assets-cdn.github.com/images/icons/emoji/unicode/1f4bf.png?v7",
        :bread "https://assets-cdn.github.com/images/icons/emoji/unicode/1f35e.png?v7",
        :melon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f348.png?v7",
        :fuelpump "https://assets-cdn.github.com/images/icons/emoji/unicode/26fd.png?v7",
        :walking "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6b6.png?v7",
        :man_cartwheeling "https://assets-cdn.github.com/images/icons/emoji/unicode/1f938-2642.png?v7",
        :crystal_ball "https://assets-cdn.github.com/images/icons/emoji/unicode/1f52e.png?v7",
        :madagascar "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f2-1f1ec.png?v7",
        :low_brightness "https://assets-cdn.github.com/images/icons/emoji/unicode/1f505.png?v7",
        :see_no_evil "https://assets-cdn.github.com/images/icons/emoji/unicode/1f648.png?v7",
        :peace_symbol "https://assets-cdn.github.com/images/icons/emoji/unicode/262e.png?v7",
        :woman_cartwheeling "https://assets-cdn.github.com/images/icons/emoji/unicode/1f938-2640.png?v7",
        :waxing_crescent_moon "https://assets-cdn.github.com/images/icons/emoji/unicode/1f312.png?v7",
        :confounded "https://assets-cdn.github.com/images/icons/emoji/unicode/1f616.png?v7",
        :eye "https://assets-cdn.github.com/images/icons/emoji/unicode/1f441.png?v7",
        :kiss "https://assets-cdn.github.com/images/icons/emoji/unicode/1f48b.png?v7",
        :play_or_pause_button "https://assets-cdn.github.com/images/icons/emoji/unicode/23ef.png?v7",
        :family_woman_boy_boy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f466-1f466.png?v7",
        :boot "https://assets-cdn.github.com/images/icons/emoji/unicode/1f462.png?v7",
        :rice_cracker "https://assets-cdn.github.com/images/icons/emoji/unicode/1f358.png?v7",
        :spaghetti "https://assets-cdn.github.com/images/icons/emoji/unicode/1f35d.png?v7",
        :cloud "https://assets-cdn.github.com/images/icons/emoji/unicode/2601.png?v7",
        :baby_symbol "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6bc.png?v7",
        :family_woman_boy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f469-1f466.png?v7",
        :fountain_pen "https://assets-cdn.github.com/images/icons/emoji/unicode/1f58b.png?v7",
        :sao_tome_principe "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1f8-1f1f9.png?v7",
        :lock_with_ink_pen "https://assets-cdn.github.com/images/icons/emoji/unicode/1f50f.png?v7",
        :wolf "https://assets-cdn.github.com/images/icons/emoji/unicode/1f43a.png?v7",
        :joy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f602.png?v7",
        :wastebasket "https://assets-cdn.github.com/images/icons/emoji/unicode/1f5d1.png?v7",
        :benin "https://assets-cdn.github.com/images/icons/emoji/unicode/1f1e7-1f1ef.png?v7",
        :octocat "https://assets-cdn.github.com/images/icons/emoji/octocat.png?v7",
        :vertical_traffic_light "https://assets-cdn.github.com/images/icons/emoji/unicode/1f6a6.png?v7",
        :family_man_boy_boy "https://assets-cdn.github.com/images/icons/emoji/unicode/1f468-1f466-1f466.png?v7",
        :white_medium_square "https://assets-cdn.github.com/images/icons/emoji/unicode/25fb.png?v7",
        :art "https://assets-cdn.github.com/images/icons/emoji/unicode/1f3a8.png?v7"}})

(defonce running? (cell false))

(defn results-table
  [results]
  (s/table
    :options #{:striped :hover}
    :toggle (cell= (seq results))
    :css {:max-width "600px"}
    (h/thead
      (h/tr
        (h/th "Name")
        (h/th "ops/sec")
        (h/th "rme")
        (h/th "samples")
        (h/th "relative")))
    (h/tbody
      (for-tpl [{:keys [name ops-sec rme samples]} (cell= (sort-by :ops-sec > (vals results)))]
               (let [max-ops-sec (cell= (apply max (map :ops-sec (vals results))))]
               (h/tr
                 (h/td
                   (h/text "~{name}"))
                 (h/td :css {:text-align "right"}
                   (h/text "~(js/Benchmark.formatNumber ops-sec)"))
                 (h/td :css {:text-align "right"}
                   (h/text "±~{rme}%"))
                 (h/td :css {:text-align "right"}
                   (h/text "~{samples}"))
                 (h/td :css {:text-align "right"}
                   (h/text "~(.toFixed  (* 100 (/ ops-sec max-ops-sec)) 2)%"))))))))

(defn benchmark
  [data results type k title]
  (h/div
    (h/h3 title)
    (s/button
      :click #(swap! results update-in [type :show-data k] not)
      "Show data")
    (h/pre
      :toggle (cell= (get-in results [type :show-data k]))
      (with-out-str (fipp/pprint (get data k))))
    (s/button-primary :click #(run-write-benchmark data results type k)
      "Run bench")
    (h/h4
      :toggle (cell= (get-in results [type :running k]))
      "Running benchmark")
    (results-table (cell= (get-in results [type k])))))

(defn show
  [data results]
  (h/div
    (h/h2 "Write data benchmarks")
    (benchmark data results :write :d0 "Tiny data")
    (benchmark data results :write :d1 "Really Small data")
    (benchmark data results :write :d2 "Small data")
    (benchmark data results :write :d3 "Data")
    (benchmark data results :write :d4 "Large Data")
    (h/p (.-description (.-platform js/Benchmark)))))
