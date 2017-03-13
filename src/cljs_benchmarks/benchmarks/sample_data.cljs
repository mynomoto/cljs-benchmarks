(ns cljs-benchmarks.benchmarks.sample-data)

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
   :d4 [{:html_url "https://github.com/brunoguerra/amortization-price",
         :description "Learing through playing with clojure",
         :open_issues_count 1,
         :watchers 2,
         :ssh_url "git@github.com:brunoguerra/amortization-price.git",
         :hooks_url
         "https://api.github.com/repos/brunoguerra/amortization-price/hooks",
         :archive_url
         "https://api.github.com/repos/brunoguerra/amortization-price/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/brunoguerra/amortization-price/keys{/key_id}",
         :forks_count 0,
         :languages_url
         "https://api.github.com/repos/brunoguerra/amortization-price/languages",
         :git_url "git://github.com/brunoguerra/amortization-price.git",
         :permissions {:admin false, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/brunoguerra/amortization-price/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/brunoguerra/amortization-price/git/refs{/sha}",
         :clone_url "https://github.com/brunoguerra/amortization-price.git",
         :contents_url
         "https://api.github.com/repos/brunoguerra/amortization-price/contents/{+path}",
         :has_downloads true,
         :teams_url
         "https://api.github.com/repos/brunoguerra/amortization-price/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/brunoguerra/amortization-price/issues/events{/number}",
         :private false,
         :watchers_count 2,
         :collaborators_url
         "https://api.github.com/repos/brunoguerra/amortization-price/collaborators{/collaborator}",
         :homepage "",
         :git_commits_url
         "https://api.github.com/repos/brunoguerra/amortization-price/git/commits{/sha}",
         :name "amortization-price",
         :releases_url
         "https://api.github.com/repos/brunoguerra/amortization-price/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/brunoguerra/amortization-price/milestones{/number}",
         :svn_url "https://github.com/brunoguerra/amortization-price",
         :merges_url
         "https://api.github.com/repos/brunoguerra/amortization-price/merges",
         :compare_url
         "https://api.github.com/repos/brunoguerra/amortization-price/compare/{base}...{head}",
         :stargazers_count 2,
         :tags_url
         "https://api.github.com/repos/brunoguerra/amortization-price/tags",
         :statuses_url
         "https://api.github.com/repos/brunoguerra/amortization-price/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/brunoguerra/amortization-price/notifications{?since,all,participating}",
         :open_issues 1,
         :has_wiki true,
         :size 8,
         :assignees_url
         "https://api.github.com/repos/brunoguerra/amortization-price/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/brunoguerra/amortization-price/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/brunoguerra/amortization-price/labels{/name}",
         :forks_url
         "https://api.github.com/repos/brunoguerra/amortization-price/forks",
         :contributors_url
         "https://api.github.com/repos/brunoguerra/amortization-price/contributors",
         :updated_at "2017-02-05T15:51:25Z",
         :pulls_url
         "https://api.github.com/repos/brunoguerra/amortization-price/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/brunoguerra/amortization-price/comments{/number}",
         :id 57209477,
         :stargazers_url
         "https://api.github.com/repos/brunoguerra/amortization-price/stargazers",
         :issues_url
         "https://api.github.com/repos/brunoguerra/amortization-price/issues{/number}",
         :trees_url
         "https://api.github.com/repos/brunoguerra/amortization-price/git/trees{/sha}",
         :events_url
         "https://api.github.com/repos/brunoguerra/amortization-price/events",
         :branches_url
         "https://api.github.com/repos/brunoguerra/amortization-price/branches{/branch}",
         :url "https://api.github.com/repos/brunoguerra/amortization-price",
         :downloads_url
         "https://api.github.com/repos/brunoguerra/amortization-price/downloads",
         :forks 0,
         :subscribers_url
         "https://api.github.com/repos/brunoguerra/amortization-price/subscribers",
         :full_name "brunoguerra/amortization-price",
         :blobs_url
         "https://api.github.com/repos/brunoguerra/amortization-price/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/brunoguerra/amortization-price/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/brunoguerra/amortization-price/deployments",
         :pushed_at "2016-05-09T22:07:50Z",
         :owner
         {:html_url "https://github.com/brunoguerra",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/brunoguerra/followers",
          :subscriptions_url
          "https://api.github.com/users/brunoguerra/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/brunoguerra/following{/other_user}",
          :type "User",
          :received_events_url
          "https://api.github.com/users/brunoguerra/received_events",
          :login "brunoguerra",
          :organizations_url "https://api.github.com/users/brunoguerra/orgs",
          :id 2850027,
          :events_url
          "https://api.github.com/users/brunoguerra/events{/privacy}",
          :url "https://api.github.com/users/brunoguerra",
          :repos_url "https://api.github.com/users/brunoguerra/repos",
          :starred_url
          "https://api.github.com/users/brunoguerra/starred{/owner}{/repo}",
          :gists_url
          "https://api.github.com/users/brunoguerra/gists{/gist_id}",
          :avatar_url "https://avatars1.githubusercontent.com/u/2850027?v=3"},
         :git_tags_url
         "https://api.github.com/repos/brunoguerra/amortization-price/git/tags{/sha}",
         :created_at "2016-04-27T11:50:59Z",
         :mirror_url nil}
        {:html_url "https://github.com/clj-sp/matasano",
         :description nil,
         :open_issues_count 1,
         :watchers 3,
         :ssh_url "git@github.com:clj-sp/matasano.git",
         :hooks_url "https://api.github.com/repos/clj-sp/matasano/hooks",
         :archive_url
         "https://api.github.com/repos/clj-sp/matasano/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/clj-sp/matasano/keys{/key_id}",
         :forks_count 1,
         :languages_url
         "https://api.github.com/repos/clj-sp/matasano/languages",
         :git_url "git://github.com/clj-sp/matasano.git",
         :permissions {:admin false, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/clj-sp/matasano/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/clj-sp/matasano/git/refs{/sha}",
         :clone_url "https://github.com/clj-sp/matasano.git",
         :contents_url
         "https://api.github.com/repos/clj-sp/matasano/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/clj-sp/matasano/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/clj-sp/matasano/issues/events{/number}",
         :private false,
         :watchers_count 3,
         :collaborators_url
         "https://api.github.com/repos/clj-sp/matasano/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/clj-sp/matasano/git/commits{/sha}",
         :name "matasano",
         :releases_url
         "https://api.github.com/repos/clj-sp/matasano/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/clj-sp/matasano/milestones{/number}",
         :svn_url "https://github.com/clj-sp/matasano",
         :merges_url "https://api.github.com/repos/clj-sp/matasano/merges",
         :compare_url
         "https://api.github.com/repos/clj-sp/matasano/compare/{base}...{head}",
         :stargazers_count 3,
         :tags_url "https://api.github.com/repos/clj-sp/matasano/tags",
         :statuses_url
         "https://api.github.com/repos/clj-sp/matasano/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/clj-sp/matasano/notifications{?since,all,participating}",
         :open_issues 1,
         :has_wiki true,
         :size 371,
         :assignees_url
         "https://api.github.com/repos/clj-sp/matasano/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/clj-sp/matasano/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/clj-sp/matasano/labels{/name}",
         :forks_url "https://api.github.com/repos/clj-sp/matasano/forks",
         :contributors_url
         "https://api.github.com/repos/clj-sp/matasano/contributors",
         :updated_at "2015-12-04T20:30:42Z",
         :pulls_url
         "https://api.github.com/repos/clj-sp/matasano/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/clj-sp/matasano/comments{/number}",
         :id 22229907,
         :stargazers_url
         "https://api.github.com/repos/clj-sp/matasano/stargazers",
         :issues_url
         "https://api.github.com/repos/clj-sp/matasano/issues{/number}",
         :trees_url
         "https://api.github.com/repos/clj-sp/matasano/git/trees{/sha}",
         :events_url "https://api.github.com/repos/clj-sp/matasano/events",
         :branches_url
         "https://api.github.com/repos/clj-sp/matasano/branches{/branch}",
         :url "https://api.github.com/repos/clj-sp/matasano",
         :downloads_url
         "https://api.github.com/repos/clj-sp/matasano/downloads",
         :forks 1,
         :subscribers_url
         "https://api.github.com/repos/clj-sp/matasano/subscribers",
         :full_name "clj-sp/matasano",
         :blobs_url
         "https://api.github.com/repos/clj-sp/matasano/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/clj-sp/matasano/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/clj-sp/matasano/deployments",
         :pushed_at "2015-03-20T02:08:03Z",
         :owner
         {:html_url "https://github.com/clj-sp",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/clj-sp/followers",
          :subscriptions_url
          "https://api.github.com/users/clj-sp/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/clj-sp/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/clj-sp/received_events",
          :login "clj-sp",
          :organizations_url "https://api.github.com/users/clj-sp/orgs",
          :id 7409015,
          :events_url "https://api.github.com/users/clj-sp/events{/privacy}",
          :url "https://api.github.com/users/clj-sp",
          :repos_url "https://api.github.com/users/clj-sp/repos",
          :starred_url
          "https://api.github.com/users/clj-sp/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/clj-sp/gists{/gist_id}",
          :avatar_url "https://avatars3.githubusercontent.com/u/7409015?v=3"},
         :git_tags_url
         "https://api.github.com/repos/clj-sp/matasano/git/tags{/sha}",
         :created_at "2014-07-24T20:31:28Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/boot-hoplon",
         :description "Boot task to build Hoplon web applications.",
         :open_issues_count 4,
         :watchers 6,
         :ssh_url "git@github.com:hoplon/boot-hoplon.git",
         :hooks_url "https://api.github.com/repos/hoplon/boot-hoplon/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/boot-hoplon/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/boot-hoplon/keys{/key_id}",
         :forks_count 4,
         :languages_url
         "https://api.github.com/repos/hoplon/boot-hoplon/languages",
         :git_url "git://github.com/hoplon/boot-hoplon.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/boot-hoplon/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/boot-hoplon/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/boot-hoplon.git",
         :contents_url
         "https://api.github.com/repos/hoplon/boot-hoplon/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/boot-hoplon/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/boot-hoplon/issues/events{/number}",
         :private false,
         :watchers_count 6,
         :collaborators_url
         "https://api.github.com/repos/hoplon/boot-hoplon/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/boot-hoplon/git/commits{/sha}",
         :name "boot-hoplon",
         :releases_url
         "https://api.github.com/repos/hoplon/boot-hoplon/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/boot-hoplon/milestones{/number}",
         :svn_url "https://github.com/hoplon/boot-hoplon",
         :merges_url "https://api.github.com/repos/hoplon/boot-hoplon/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/boot-hoplon/compare/{base}...{head}",
         :stargazers_count 6,
         :tags_url "https://api.github.com/repos/hoplon/boot-hoplon/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/boot-hoplon/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/boot-hoplon/notifications{?since,all,participating}",
         :open_issues 4,
         :has_wiki false,
         :size 79,
         :assignees_url
         "https://api.github.com/repos/hoplon/boot-hoplon/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/boot-hoplon/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/boot-hoplon/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/boot-hoplon/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/boot-hoplon/contributors",
         :updated_at "2016-10-23T17:55:23Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/boot-hoplon/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/boot-hoplon/comments{/number}",
         :id 30472943,
         :stargazers_url
         "https://api.github.com/repos/hoplon/boot-hoplon/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/boot-hoplon/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/boot-hoplon/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/boot-hoplon/events",
         :branches_url
         "https://api.github.com/repos/hoplon/boot-hoplon/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/boot-hoplon",
         :downloads_url
         "https://api.github.com/repos/hoplon/boot-hoplon/downloads",
         :forks 4,
         :subscribers_url
         "https://api.github.com/repos/hoplon/boot-hoplon/subscribers",
         :full_name "hoplon/boot-hoplon",
         :blobs_url
         "https://api.github.com/repos/hoplon/boot-hoplon/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/boot-hoplon/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/boot-hoplon/deployments",
         :pushed_at "2016-10-23T19:41:27Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/boot-hoplon/git/tags{/sha}",
         :created_at "2015-02-07T22:42:45Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/brew",
         :description "Experimental brewing of Hoplon components.",
         :open_issues_count 1,
         :watchers 3,
         :ssh_url "git@github.com:hoplon/brew.git",
         :hooks_url "https://api.github.com/repos/hoplon/brew/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/brew/{archive_format}{/ref}",
         :keys_url "https://api.github.com/repos/hoplon/brew/keys{/key_id}",
         :forks_count 2,
         :languages_url "https://api.github.com/repos/hoplon/brew/languages",
         :git_url "git://github.com/hoplon/brew.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/brew/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/brew/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/brew.git",
         :contents_url
         "https://api.github.com/repos/hoplon/brew/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/brew/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/brew/issues/events{/number}",
         :private false,
         :watchers_count 3,
         :collaborators_url
         "https://api.github.com/repos/hoplon/brew/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/brew/git/commits{/sha}",
         :name "brew",
         :releases_url
         "https://api.github.com/repos/hoplon/brew/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/brew/milestones{/number}",
         :svn_url "https://github.com/hoplon/brew",
         :merges_url "https://api.github.com/repos/hoplon/brew/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/brew/compare/{base}...{head}",
         :stargazers_count 3,
         :tags_url "https://api.github.com/repos/hoplon/brew/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/brew/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/brew/notifications{?since,all,participating}",
         :open_issues 1,
         :has_wiki true,
         :size 44,
         :assignees_url
         "https://api.github.com/repos/hoplon/brew/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/brew/commits{/sha}",
         :labels_url "https://api.github.com/repos/hoplon/brew/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/brew/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/brew/contributors",
         :updated_at "2017-01-23T22:46:55Z",
         :pulls_url "https://api.github.com/repos/hoplon/brew/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/brew/comments{/number}",
         :id 63353059,
         :stargazers_url
         "https://api.github.com/repos/hoplon/brew/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/brew/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/brew/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/brew/events",
         :branches_url
         "https://api.github.com/repos/hoplon/brew/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/brew",
         :downloads_url "https://api.github.com/repos/hoplon/brew/downloads",
         :forks 2,
         :subscribers_url
         "https://api.github.com/repos/hoplon/brew/subscribers",
         :full_name "hoplon/brew",
         :blobs_url
         "https://api.github.com/repos/hoplon/brew/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/brew/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/brew/deployments",
         :pushed_at "2016-12-03T20:12:32Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/brew/git/tags{/sha}",
         :created_at "2016-07-14T16:39:07Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/castra",
         :description "HTTP remote procedure call handler for Clojure.",
         :open_issues_count 10,
         :watchers 112,
         :ssh_url "git@github.com:hoplon/castra.git",
         :hooks_url "https://api.github.com/repos/hoplon/castra/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/castra/{archive_format}{/ref}",
         :keys_url "https://api.github.com/repos/hoplon/castra/keys{/key_id}",
         :forks_count 19,
         :languages_url
         "https://api.github.com/repos/hoplon/castra/languages",
         :git_url "git://github.com/hoplon/castra.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/castra/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/castra/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/castra.git",
         :contents_url
         "https://api.github.com/repos/hoplon/castra/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/castra/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/castra/issues/events{/number}",
         :private false,
         :watchers_count 112,
         :collaborators_url
         "https://api.github.com/repos/hoplon/castra/collaborators{/collaborator}",
         :homepage "",
         :git_commits_url
         "https://api.github.com/repos/hoplon/castra/git/commits{/sha}",
         :name "castra",
         :releases_url
         "https://api.github.com/repos/hoplon/castra/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/castra/milestones{/number}",
         :svn_url "https://github.com/hoplon/castra",
         :merges_url "https://api.github.com/repos/hoplon/castra/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/castra/compare/{base}...{head}",
         :stargazers_count 112,
         :tags_url "https://api.github.com/repos/hoplon/castra/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/castra/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/castra/notifications{?since,all,participating}",
         :open_issues 10,
         :has_wiki false,
         :size 1159,
         :assignees_url
         "https://api.github.com/repos/hoplon/castra/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/castra/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/castra/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/castra/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/castra/contributors",
         :updated_at "2017-02-27T02:35:31Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/castra/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/castra/comments{/number}",
         :id 10530110,
         :stargazers_url
         "https://api.github.com/repos/hoplon/castra/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/castra/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/castra/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/castra/events",
         :branches_url
         "https://api.github.com/repos/hoplon/castra/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/castra",
         :downloads_url
         "https://api.github.com/repos/hoplon/castra/downloads",
         :forks 19,
         :subscribers_url
         "https://api.github.com/repos/hoplon/castra/subscribers",
         :full_name "hoplon/castra",
         :blobs_url
         "https://api.github.com/repos/hoplon/castra/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/castra/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/castra/deployments",
         :pushed_at "2016-12-21T10:54:48Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/castra/git/tags{/sha}",
         :created_at "2013-06-06T15:43:20Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/demos",
         :description "Example ClojureScript applications using hoplon",
         :open_issues_count 2,
         :watchers 68,
         :ssh_url "git@github.com:hoplon/demos.git",
         :hooks_url "https://api.github.com/repos/hoplon/demos/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/demos/{archive_format}{/ref}",
         :keys_url "https://api.github.com/repos/hoplon/demos/keys{/key_id}",
         :forks_count 23,
         :languages_url "https://api.github.com/repos/hoplon/demos/languages",
         :git_url "git://github.com/hoplon/demos.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/demos/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/demos/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/demos.git",
         :contents_url
         "https://api.github.com/repos/hoplon/demos/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/demos/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/demos/issues/events{/number}",
         :private false,
         :watchers_count 68,
         :collaborators_url
         "https://api.github.com/repos/hoplon/demos/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/demos/git/commits{/sha}",
         :name "demos",
         :releases_url
         "https://api.github.com/repos/hoplon/demos/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/demos/milestones{/number}",
         :svn_url "https://github.com/hoplon/demos",
         :merges_url "https://api.github.com/repos/hoplon/demos/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/demos/compare/{base}...{head}",
         :stargazers_count 68,
         :tags_url "https://api.github.com/repos/hoplon/demos/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/demos/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/demos/notifications{?since,all,participating}",
         :open_issues 2,
         :has_wiki false,
         :size 10276,
         :assignees_url
         "https://api.github.com/repos/hoplon/demos/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/demos/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/demos/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/demos/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/demos/contributors",
         :updated_at "2017-02-09T05:26:48Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/demos/pulls{/number}",
         :has_pages true,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/demos/comments{/number}",
         :id 10115290,
         :stargazers_url
         "https://api.github.com/repos/hoplon/demos/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/demos/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/demos/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/demos/events",
         :branches_url
         "https://api.github.com/repos/hoplon/demos/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/demos",
         :downloads_url "https://api.github.com/repos/hoplon/demos/downloads",
         :forks 23,
         :subscribers_url
         "https://api.github.com/repos/hoplon/demos/subscribers",
         :full_name "hoplon/demos",
         :blobs_url
         "https://api.github.com/repos/hoplon/demos/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/demos/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/demos/deployments",
         :pushed_at "2016-08-15T15:28:55Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/demos/git/tags{/sha}",
         :created_at "2013-05-17T03:24:09Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/google-loader",
         :description "hoplon wrapper for google loader",
         :open_issues_count 0,
         :watchers 1,
         :ssh_url "git@github.com:hoplon/google-loader.git",
         :hooks_url "https://api.github.com/repos/hoplon/google-loader/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/google-loader/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/google-loader/keys{/key_id}",
         :forks_count 1,
         :languages_url
         "https://api.github.com/repos/hoplon/google-loader/languages",
         :git_url "git://github.com/hoplon/google-loader.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/google-loader/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/google-loader/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/google-loader.git",
         :contents_url
         "https://api.github.com/repos/hoplon/google-loader/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/google-loader/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/google-loader/issues/events{/number}",
         :private false,
         :watchers_count 1,
         :collaborators_url
         "https://api.github.com/repos/hoplon/google-loader/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/google-loader/git/commits{/sha}",
         :name "google-loader",
         :releases_url
         "https://api.github.com/repos/hoplon/google-loader/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/google-loader/milestones{/number}",
         :svn_url "https://github.com/hoplon/google-loader",
         :merges_url
         "https://api.github.com/repos/hoplon/google-loader/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/google-loader/compare/{base}...{head}",
         :stargazers_count 1,
         :tags_url "https://api.github.com/repos/hoplon/google-loader/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/google-loader/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/google-loader/notifications{?since,all,participating}",
         :open_issues 0,
         :has_wiki true,
         :size 112,
         :assignees_url
         "https://api.github.com/repos/hoplon/google-loader/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/google-loader/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/google-loader/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/google-loader/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/google-loader/contributors",
         :updated_at "2015-02-15T04:52:39Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/google-loader/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/google-loader/comments{/number}",
         :id 30771178,
         :stargazers_url
         "https://api.github.com/repos/hoplon/google-loader/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/google-loader/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/google-loader/git/trees{/sha}",
         :events_url
         "https://api.github.com/repos/hoplon/google-loader/events",
         :branches_url
         "https://api.github.com/repos/hoplon/google-loader/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/google-loader",
         :downloads_url
         "https://api.github.com/repos/hoplon/google-loader/downloads",
         :forks 1,
         :subscribers_url
         "https://api.github.com/repos/hoplon/google-loader/subscribers",
         :full_name "hoplon/google-loader",
         :blobs_url
         "https://api.github.com/repos/hoplon/google-loader/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/google-loader/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/google-loader/deployments",
         :pushed_at "2015-09-23T03:16:18Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/google-loader/git/tags{/sha}",
         :created_at "2015-02-13T19:04:57Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/google-maps",
         :description "hoplon component for google maps",
         :open_issues_count 2,
         :watchers 1,
         :ssh_url "git@github.com:hoplon/google-maps.git",
         :hooks_url "https://api.github.com/repos/hoplon/google-maps/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/google-maps/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/google-maps/keys{/key_id}",
         :forks_count 3,
         :languages_url
         "https://api.github.com/repos/hoplon/google-maps/languages",
         :git_url "git://github.com/hoplon/google-maps.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/google-maps/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/google-maps/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/google-maps.git",
         :contents_url
         "https://api.github.com/repos/hoplon/google-maps/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/google-maps/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/google-maps/issues/events{/number}",
         :private false,
         :watchers_count 1,
         :collaborators_url
         "https://api.github.com/repos/hoplon/google-maps/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/google-maps/git/commits{/sha}",
         :name "google-maps",
         :releases_url
         "https://api.github.com/repos/hoplon/google-maps/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/google-maps/milestones{/number}",
         :svn_url "https://github.com/hoplon/google-maps",
         :merges_url "https://api.github.com/repos/hoplon/google-maps/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/google-maps/compare/{base}...{head}",
         :stargazers_count 1,
         :tags_url "https://api.github.com/repos/hoplon/google-maps/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/google-maps/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/google-maps/notifications{?since,all,participating}",
         :open_issues 2,
         :has_wiki true,
         :size 6,
         :assignees_url
         "https://api.github.com/repos/hoplon/google-maps/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/google-maps/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/google-maps/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/google-maps/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/google-maps/contributors",
         :updated_at "2015-02-22T19:22:24Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/google-maps/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/google-maps/comments{/number}",
         :id 30773755,
         :stargazers_url
         "https://api.github.com/repos/hoplon/google-maps/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/google-maps/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/google-maps/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/google-maps/events",
         :branches_url
         "https://api.github.com/repos/hoplon/google-maps/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/google-maps",
         :downloads_url
         "https://api.github.com/repos/hoplon/google-maps/downloads",
         :forks 3,
         :subscribers_url
         "https://api.github.com/repos/hoplon/google-maps/subscribers",
         :full_name "hoplon/google-maps",
         :blobs_url
         "https://api.github.com/repos/hoplon/google-maps/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/google-maps/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/google-maps/deployments",
         :pushed_at "2016-09-05T20:57:45Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/google-maps/git/tags{/sha}",
         :created_at "2015-02-13T20:04:46Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/highlight",
         :description "Hoplon highlight-js component",
         :open_issues_count 0,
         :watchers 1,
         :ssh_url "git@github.com:hoplon/highlight.git",
         :hooks_url "https://api.github.com/repos/hoplon/highlight/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/highlight/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/highlight/keys{/key_id}",
         :forks_count 1,
         :languages_url
         "https://api.github.com/repos/hoplon/highlight/languages",
         :git_url "git://github.com/hoplon/highlight.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/highlight/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/highlight/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/highlight.git",
         :contents_url
         "https://api.github.com/repos/hoplon/highlight/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/highlight/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/highlight/issues/events{/number}",
         :private false,
         :watchers_count 1,
         :collaborators_url
         "https://api.github.com/repos/hoplon/highlight/collaborators{/collaborator}",
         :homepage "",
         :git_commits_url
         "https://api.github.com/repos/hoplon/highlight/git/commits{/sha}",
         :name "highlight",
         :releases_url
         "https://api.github.com/repos/hoplon/highlight/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/highlight/milestones{/number}",
         :svn_url "https://github.com/hoplon/highlight",
         :merges_url "https://api.github.com/repos/hoplon/highlight/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/highlight/compare/{base}...{head}",
         :stargazers_count 1,
         :tags_url "https://api.github.com/repos/hoplon/highlight/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/highlight/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/highlight/notifications{?since,all,participating}",
         :open_issues 0,
         :has_wiki true,
         :size 2,
         :assignees_url
         "https://api.github.com/repos/hoplon/highlight/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/highlight/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/highlight/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/highlight/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/highlight/contributors",
         :updated_at "2016-06-12T14:22:09Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/highlight/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/highlight/comments{/number}",
         :id 36999929,
         :stargazers_url
         "https://api.github.com/repos/hoplon/highlight/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/highlight/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/highlight/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/highlight/events",
         :branches_url
         "https://api.github.com/repos/hoplon/highlight/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/highlight",
         :downloads_url
         "https://api.github.com/repos/hoplon/highlight/downloads",
         :forks 1,
         :subscribers_url
         "https://api.github.com/repos/hoplon/highlight/subscribers",
         :full_name "hoplon/highlight",
         :blobs_url
         "https://api.github.com/repos/hoplon/highlight/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/highlight/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/highlight/deployments",
         :pushed_at "2016-06-12T14:22:08Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/highlight/git/tags{/sha}",
         :created_at "2015-06-07T00:55:47Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/hoplon",
         :description "Hoplon web development tools and libraries.",
         :open_issues_count 35,
         :watchers 714,
         :ssh_url "git@github.com:hoplon/hoplon.git",
         :hooks_url "https://api.github.com/repos/hoplon/hoplon/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/hoplon/{archive_format}{/ref}",
         :keys_url "https://api.github.com/repos/hoplon/hoplon/keys{/key_id}",
         :forks_count 54,
         :languages_url
         "https://api.github.com/repos/hoplon/hoplon/languages",
         :git_url "git://github.com/hoplon/hoplon.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/hoplon/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/hoplon/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/hoplon.git",
         :contents_url
         "https://api.github.com/repos/hoplon/hoplon/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/hoplon/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/hoplon/issues/events{/number}",
         :private false,
         :watchers_count 714,
         :collaborators_url
         "https://api.github.com/repos/hoplon/hoplon/collaborators{/collaborator}",
         :homepage "http://hoplon.io/",
         :git_commits_url
         "https://api.github.com/repos/hoplon/hoplon/git/commits{/sha}",
         :name "hoplon",
         :releases_url
         "https://api.github.com/repos/hoplon/hoplon/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/hoplon/milestones{/number}",
         :svn_url "https://github.com/hoplon/hoplon",
         :merges_url "https://api.github.com/repos/hoplon/hoplon/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/hoplon/compare/{base}...{head}",
         :stargazers_count 714,
         :tags_url "https://api.github.com/repos/hoplon/hoplon/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/hoplon/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/hoplon/notifications{?since,all,participating}",
         :open_issues 35,
         :has_wiki true,
         :size 1793,
         :assignees_url
         "https://api.github.com/repos/hoplon/hoplon/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/hoplon/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/hoplon/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/hoplon/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/hoplon/contributors",
         :updated_at "2017-03-09T06:38:39Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/hoplon/pulls{/number}",
         :has_pages true,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/hoplon/comments{/number}",
         :id 10087975,
         :stargazers_url
         "https://api.github.com/repos/hoplon/hoplon/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/hoplon/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/hoplon/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/hoplon/events",
         :branches_url
         "https://api.github.com/repos/hoplon/hoplon/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/hoplon",
         :downloads_url
         "https://api.github.com/repos/hoplon/hoplon/downloads",
         :forks 54,
         :subscribers_url
         "https://api.github.com/repos/hoplon/hoplon/subscribers",
         :full_name "hoplon/hoplon",
         :blobs_url
         "https://api.github.com/repos/hoplon/hoplon/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/hoplon/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/hoplon/deployments",
         :pushed_at "2017-02-20T06:48:10Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/hoplon/git/tags{/sha}",
         :created_at "2013-05-15T21:06:03Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/hoplon-castra-template",
         :description "Create new Hoplon projects with Castra",
         :open_issues_count 4,
         :watchers 5,
         :ssh_url "git@github.com:hoplon/hoplon-castra-template.git",
         :hooks_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/keys{/key_id}",
         :forks_count 5,
         :languages_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/languages",
         :git_url "git://github.com/hoplon/hoplon-castra-template.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/hoplon-castra-template.git",
         :contents_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/contents/{+path}",
         :has_downloads true,
         :teams_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/issues/events{/number}",
         :private false,
         :watchers_count 5,
         :collaborators_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/collaborators{/collaborator}",
         :homepage "",
         :git_commits_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/git/commits{/sha}",
         :name "hoplon-castra-template",
         :releases_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/milestones{/number}",
         :svn_url "https://github.com/hoplon/hoplon-castra-template",
         :merges_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/compare/{base}...{head}",
         :stargazers_count 5,
         :tags_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/notifications{?since,all,participating}",
         :open_issues 4,
         :has_wiki true,
         :size 37,
         :assignees_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/labels{/name}",
         :forks_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/contributors",
         :updated_at "2017-03-08T05:48:30Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/comments{/number}",
         :id 18903156,
         :stargazers_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/git/trees{/sha}",
         :events_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/events",
         :branches_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/hoplon-castra-template",
         :downloads_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/downloads",
         :forks 5,
         :subscribers_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/subscribers",
         :full_name "hoplon/hoplon-castra-template",
         :blobs_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/deployments",
         :pushed_at "2017-03-10T16:19:34Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/hoplon-castra-template/git/tags{/sha}",
         :created_at "2014-04-18T05:03:12Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/hoplon-template",
         :description "Leiningen template for creating new Hoplon projects.",
         :open_issues_count 2,
         :watchers 5,
         :ssh_url "git@github.com:hoplon/hoplon-template.git",
         :hooks_url
         "https://api.github.com/repos/hoplon/hoplon-template/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/hoplon-template/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/hoplon-template/keys{/key_id}",
         :forks_count 7,
         :languages_url
         "https://api.github.com/repos/hoplon/hoplon-template/languages",
         :git_url "git://github.com/hoplon/hoplon-template.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/hoplon-template/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/hoplon-template/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/hoplon-template.git",
         :contents_url
         "https://api.github.com/repos/hoplon/hoplon-template/contents/{+path}",
         :has_downloads true,
         :teams_url
         "https://api.github.com/repos/hoplon/hoplon-template/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/hoplon-template/issues/events{/number}",
         :private false,
         :watchers_count 5,
         :collaborators_url
         "https://api.github.com/repos/hoplon/hoplon-template/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/hoplon-template/git/commits{/sha}",
         :name "hoplon-template",
         :releases_url
         "https://api.github.com/repos/hoplon/hoplon-template/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/hoplon-template/milestones{/number}",
         :svn_url "https://github.com/hoplon/hoplon-template",
         :merges_url
         "https://api.github.com/repos/hoplon/hoplon-template/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/hoplon-template/compare/{base}...{head}",
         :stargazers_count 5,
         :tags_url "https://api.github.com/repos/hoplon/hoplon-template/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/hoplon-template/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/hoplon-template/notifications{?since,all,participating}",
         :open_issues 2,
         :has_wiki true,
         :size 40,
         :assignees_url
         "https://api.github.com/repos/hoplon/hoplon-template/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/hoplon-template/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/hoplon-template/labels{/name}",
         :forks_url
         "https://api.github.com/repos/hoplon/hoplon-template/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/hoplon-template/contributors",
         :updated_at "2017-01-03T19:55:32Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/hoplon-template/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/hoplon-template/comments{/number}",
         :id 10135578,
         :stargazers_url
         "https://api.github.com/repos/hoplon/hoplon-template/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/hoplon-template/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/hoplon-template/git/trees{/sha}",
         :events_url
         "https://api.github.com/repos/hoplon/hoplon-template/events",
         :branches_url
         "https://api.github.com/repos/hoplon/hoplon-template/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/hoplon-template",
         :downloads_url
         "https://api.github.com/repos/hoplon/hoplon-template/downloads",
         :forks 7,
         :subscribers_url
         "https://api.github.com/repos/hoplon/hoplon-template/subscribers",
         :full_name "hoplon/hoplon-template",
         :blobs_url
         "https://api.github.com/repos/hoplon/hoplon-template/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/hoplon-template/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/hoplon-template/deployments",
         :pushed_at "2017-01-03T20:14:25Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/hoplon-template/git/tags{/sha}",
         :created_at "2013-05-18T02:23:52Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/hoplon.github.io",
         :description "Hoplon web site",
         :open_issues_count 1,
         :watchers 0,
         :ssh_url "git@github.com:hoplon/hoplon.github.io.git",
         :hooks_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/keys{/key_id}",
         :forks_count 1,
         :languages_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/languages",
         :git_url "git://github.com/hoplon/hoplon.github.io.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/hoplon.github.io.git",
         :contents_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/contents/{+path}",
         :has_downloads true,
         :teams_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/issues/events{/number}",
         :private false,
         :watchers_count 0,
         :collaborators_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/collaborators{/collaborator}",
         :homepage "http://hoplon.github.io",
         :git_commits_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/git/commits{/sha}",
         :name "hoplon.github.io",
         :releases_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/milestones{/number}",
         :svn_url "https://github.com/hoplon/hoplon.github.io",
         :merges_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/compare/{base}...{head}",
         :stargazers_count 0,
         :tags_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/notifications{?since,all,participating}",
         :open_issues 1,
         :has_wiki true,
         :size 2212,
         :assignees_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/labels{/name}",
         :forks_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/contributors",
         :updated_at "2015-09-10T11:41:50Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/pulls{/number}",
         :has_pages true,
         :default_branch "master",
         :language "JavaScript",
         :comments_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/comments{/number}",
         :id 42225567,
         :stargazers_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/git/trees{/sha}",
         :events_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/events",
         :branches_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/hoplon.github.io",
         :downloads_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/downloads",
         :forks 1,
         :subscribers_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/subscribers",
         :full_name "hoplon/hoplon.github.io",
         :blobs_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/deployments",
         :pushed_at "2015-09-10T14:24:15Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/hoplon.github.io/git/tags{/sha}",
         :created_at "2015-09-10T06:06:08Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/javelin",
         :description
         "Spreadsheet-like dataflow programming in ClojureScript.",
         :open_issues_count 4,
         :watchers 575,
         :ssh_url "git@github.com:hoplon/javelin.git",
         :hooks_url "https://api.github.com/repos/hoplon/javelin/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/javelin/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/javelin/keys{/key_id}",
         :forks_count 33,
         :languages_url
         "https://api.github.com/repos/hoplon/javelin/languages",
         :git_url "git://github.com/hoplon/javelin.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/javelin/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/javelin/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/javelin.git",
         :contents_url
         "https://api.github.com/repos/hoplon/javelin/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/javelin/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/javelin/issues/events{/number}",
         :private false,
         :watchers_count 575,
         :collaborators_url
         "https://api.github.com/repos/hoplon/javelin/collaborators{/collaborator}",
         :homepage "",
         :git_commits_url
         "https://api.github.com/repos/hoplon/javelin/git/commits{/sha}",
         :name "javelin",
         :releases_url
         "https://api.github.com/repos/hoplon/javelin/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/javelin/milestones{/number}",
         :svn_url "https://github.com/hoplon/javelin",
         :merges_url "https://api.github.com/repos/hoplon/javelin/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/javelin/compare/{base}...{head}",
         :stargazers_count 575,
         :tags_url "https://api.github.com/repos/hoplon/javelin/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/javelin/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/javelin/notifications{?since,all,participating}",
         :open_issues 4,
         :has_wiki false,
         :size 401,
         :assignees_url
         "https://api.github.com/repos/hoplon/javelin/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/javelin/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/javelin/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/javelin/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/javelin/contributors",
         :updated_at "2017-03-07T07:58:21Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/javelin/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/javelin/comments{/number}",
         :id 8204897,
         :stargazers_url
         "https://api.github.com/repos/hoplon/javelin/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/javelin/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/javelin/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/javelin/events",
         :branches_url
         "https://api.github.com/repos/hoplon/javelin/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/javelin",
         :downloads_url
         "https://api.github.com/repos/hoplon/javelin/downloads",
         :forks 33,
         :subscribers_url
         "https://api.github.com/repos/hoplon/javelin/subscribers",
         :full_name "hoplon/javelin",
         :blobs_url
         "https://api.github.com/repos/hoplon/javelin/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/javelin/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/javelin/deployments",
         :pushed_at "2016-12-31T19:25:14Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/javelin/git/tags{/sha}",
         :created_at "2013-02-14T18:19:50Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/jquery.daterangepicker",
         :description nil,
         :open_issues_count 0,
         :watchers 0,
         :ssh_url "git@github.com:hoplon/jquery.daterangepicker.git",
         :hooks_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/keys{/key_id}",
         :forks_count 1,
         :languages_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/languages",
         :git_url "git://github.com/hoplon/jquery.daterangepicker.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/jquery.daterangepicker.git",
         :contents_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/contents/{+path}",
         :has_downloads true,
         :teams_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/issues/events{/number}",
         :private false,
         :watchers_count 0,
         :collaborators_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/git/commits{/sha}",
         :name "jquery.daterangepicker",
         :releases_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/milestones{/number}",
         :svn_url "https://github.com/hoplon/jquery.daterangepicker",
         :merges_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/compare/{base}...{head}",
         :stargazers_count 0,
         :tags_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/notifications{?since,all,participating}",
         :open_issues 0,
         :has_wiki true,
         :size 4,
         :assignees_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/labels{/name}",
         :forks_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/contributors",
         :updated_at "2016-02-23T01:19:38Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/comments{/number}",
         :id 42912187,
         :stargazers_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/git/trees{/sha}",
         :events_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/events",
         :branches_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/jquery.daterangepicker",
         :downloads_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/downloads",
         :forks 1,
         :subscribers_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/subscribers",
         :full_name "hoplon/jquery.daterangepicker",
         :blobs_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/deployments",
         :pushed_at "2017-01-10T17:20:28Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/jquery.daterangepicker/git/tags{/sha}",
         :created_at "2015-09-22T04:54:03Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/markdown",
         :description "Use markdown in Hoplon.",
         :open_issues_count 0,
         :watchers 1,
         :ssh_url "git@github.com:hoplon/markdown.git",
         :hooks_url "https://api.github.com/repos/hoplon/markdown/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/markdown/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/markdown/keys{/key_id}",
         :forks_count 0,
         :languages_url
         "https://api.github.com/repos/hoplon/markdown/languages",
         :git_url "git://github.com/hoplon/markdown.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/markdown/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/markdown/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/markdown.git",
         :contents_url
         "https://api.github.com/repos/hoplon/markdown/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/markdown/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/markdown/issues/events{/number}",
         :private false,
         :watchers_count 1,
         :collaborators_url
         "https://api.github.com/repos/hoplon/markdown/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/markdown/git/commits{/sha}",
         :name "markdown",
         :releases_url
         "https://api.github.com/repos/hoplon/markdown/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/markdown/milestones{/number}",
         :svn_url "https://github.com/hoplon/markdown",
         :merges_url "https://api.github.com/repos/hoplon/markdown/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/markdown/compare/{base}...{head}",
         :stargazers_count 1,
         :tags_url "https://api.github.com/repos/hoplon/markdown/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/markdown/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/markdown/notifications{?since,all,participating}",
         :open_issues 0,
         :has_wiki true,
         :size 0,
         :assignees_url
         "https://api.github.com/repos/hoplon/markdown/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/markdown/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/markdown/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/markdown/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/markdown/contributors",
         :updated_at "2015-04-25T19:23:12Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/markdown/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language nil,
         :comments_url
         "https://api.github.com/repos/hoplon/markdown/comments{/number}",
         :id 30876820,
         :stargazers_url
         "https://api.github.com/repos/hoplon/markdown/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/markdown/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/markdown/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/markdown/events",
         :branches_url
         "https://api.github.com/repos/hoplon/markdown/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/markdown",
         :downloads_url
         "https://api.github.com/repos/hoplon/markdown/downloads",
         :forks 0,
         :subscribers_url
         "https://api.github.com/repos/hoplon/markdown/subscribers",
         :full_name "hoplon/markdown",
         :blobs_url
         "https://api.github.com/repos/hoplon/markdown/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/markdown/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/markdown/deployments",
         :pushed_at "2015-02-16T16:27:48Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/markdown/git/tags{/sha}",
         :created_at "2015-02-16T16:27:48Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/notify",
         :description
         "Passes notifications via castra to a hoplon client. Uses polling.",
         :open_issues_count 0,
         :watchers 4,
         :ssh_url "git@github.com:hoplon/notify.git",
         :hooks_url "https://api.github.com/repos/hoplon/notify/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/notify/{archive_format}{/ref}",
         :keys_url "https://api.github.com/repos/hoplon/notify/keys{/key_id}",
         :forks_count 3,
         :languages_url
         "https://api.github.com/repos/hoplon/notify/languages",
         :git_url "git://github.com/hoplon/notify.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/notify/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/notify/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/notify.git",
         :contents_url
         "https://api.github.com/repos/hoplon/notify/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/notify/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/notify/issues/events{/number}",
         :private false,
         :watchers_count 4,
         :collaborators_url
         "https://api.github.com/repos/hoplon/notify/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/notify/git/commits{/sha}",
         :name "notify",
         :releases_url
         "https://api.github.com/repos/hoplon/notify/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/notify/milestones{/number}",
         :svn_url "https://github.com/hoplon/notify",
         :merges_url "https://api.github.com/repos/hoplon/notify/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/notify/compare/{base}...{head}",
         :stargazers_count 4,
         :tags_url "https://api.github.com/repos/hoplon/notify/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/notify/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/notify/notifications{?since,all,participating}",
         :open_issues 0,
         :has_wiki true,
         :size 31,
         :assignees_url
         "https://api.github.com/repos/hoplon/notify/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/notify/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/notify/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/notify/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/notify/contributors",
         :updated_at "2016-09-06T13:11:35Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/notify/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/notify/comments{/number}",
         :id 48511078,
         :stargazers_url
         "https://api.github.com/repos/hoplon/notify/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/notify/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/notify/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/notify/events",
         :branches_url
         "https://api.github.com/repos/hoplon/notify/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/notify",
         :downloads_url
         "https://api.github.com/repos/hoplon/notify/downloads",
         :forks 3,
         :subscribers_url
         "https://api.github.com/repos/hoplon/notify/subscribers",
         :full_name "hoplon/notify",
         :blobs_url
         "https://api.github.com/repos/hoplon/notify/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/notify/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/notify/deployments",
         :pushed_at "2016-01-18T15:57:32Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/notify/git/tags{/sha}",
         :created_at "2015-12-23T21:07:17Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/panoply",
         :description "Full-stack Hoplon application example",
         :open_issues_count 0,
         :watchers 4,
         :ssh_url "git@github.com:hoplon/panoply.git",
         :hooks_url "https://api.github.com/repos/hoplon/panoply/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/panoply/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/panoply/keys{/key_id}",
         :forks_count 1,
         :languages_url
         "https://api.github.com/repos/hoplon/panoply/languages",
         :git_url "git://github.com/hoplon/panoply.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/panoply/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/panoply/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/panoply.git",
         :contents_url
         "https://api.github.com/repos/hoplon/panoply/contents/{+path}",
         :has_downloads true,
         :teams_url "https://api.github.com/repos/hoplon/panoply/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/panoply/issues/events{/number}",
         :private false,
         :watchers_count 4,
         :collaborators_url
         "https://api.github.com/repos/hoplon/panoply/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/panoply/git/commits{/sha}",
         :name "panoply",
         :releases_url
         "https://api.github.com/repos/hoplon/panoply/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/panoply/milestones{/number}",
         :svn_url "https://github.com/hoplon/panoply",
         :merges_url "https://api.github.com/repos/hoplon/panoply/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/panoply/compare/{base}...{head}",
         :stargazers_count 4,
         :tags_url "https://api.github.com/repos/hoplon/panoply/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/panoply/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/panoply/notifications{?since,all,participating}",
         :open_issues 0,
         :has_wiki true,
         :size 100,
         :assignees_url
         "https://api.github.com/repos/hoplon/panoply/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/panoply/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/panoply/labels{/name}",
         :forks_url "https://api.github.com/repos/hoplon/panoply/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/panoply/contributors",
         :updated_at "2016-12-22T09:58:51Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/panoply/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/panoply/comments{/number}",
         :id 76703411,
         :stargazers_url
         "https://api.github.com/repos/hoplon/panoply/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/panoply/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/panoply/git/trees{/sha}",
         :events_url "https://api.github.com/repos/hoplon/panoply/events",
         :branches_url
         "https://api.github.com/repos/hoplon/panoply/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/panoply",
         :downloads_url
         "https://api.github.com/repos/hoplon/panoply/downloads",
         :forks 1,
         :subscribers_url
         "https://api.github.com/repos/hoplon/panoply/subscribers",
         :full_name "hoplon/panoply",
         :blobs_url
         "https://api.github.com/repos/hoplon/panoply/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/panoply/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/panoply/deployments",
         :pushed_at "2017-01-04T06:12:31Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/panoply/git/tags{/sha}",
         :created_at "2016-12-17T04:21:12Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/triclojure-hoplon-2016",
         :description "Materials for the TriClojure Hoplon Workshop",
         :open_issues_count 0,
         :watchers 0,
         :ssh_url "git@github.com:hoplon/triclojure-hoplon-2016.git",
         :hooks_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/hooks",
         :archive_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/{archive_format}{/ref}",
         :keys_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/keys{/key_id}",
         :forks_count 0,
         :languages_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/languages",
         :git_url "git://github.com/hoplon/triclojure-hoplon-2016.git",
         :permissions {:admin true, :push true, :pull true},
         :issue_comment_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/issues/comments{/number}",
         :git_refs_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/git/refs{/sha}",
         :clone_url "https://github.com/hoplon/triclojure-hoplon-2016.git",
         :contents_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/contents/{+path}",
         :has_downloads true,
         :teams_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/teams",
         :has_issues true,
         :issue_events_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/issues/events{/number}",
         :private false,
         :watchers_count 0,
         :collaborators_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/collaborators{/collaborator}",
         :homepage nil,
         :git_commits_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/git/commits{/sha}",
         :name "triclojure-hoplon-2016",
         :releases_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/releases{/id}",
         :milestones_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/milestones{/number}",
         :svn_url "https://github.com/hoplon/triclojure-hoplon-2016",
         :merges_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/merges",
         :compare_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/compare/{base}...{head}",
         :stargazers_count 0,
         :tags_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/tags",
         :statuses_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/statuses/{sha}",
         :notifications_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/notifications{?since,all,participating}",
         :open_issues 0,
         :has_wiki true,
         :size 7,
         :assignees_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/assignees{/user}",
         :commits_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/commits{/sha}",
         :labels_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/labels{/name}",
         :forks_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/forks",
         :contributors_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/contributors",
         :updated_at "2016-11-09T18:01:05Z",
         :pulls_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/pulls{/number}",
         :has_pages false,
         :default_branch "master",
         :language "Clojure",
         :comments_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/comments{/number}",
         :id 73307369,
         :stargazers_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/stargazers",
         :issues_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/issues{/number}",
         :trees_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/git/trees{/sha}",
         :events_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/events",
         :branches_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/branches{/branch}",
         :url "https://api.github.com/repos/hoplon/triclojure-hoplon-2016",
         :downloads_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/downloads",
         :forks 0,
         :subscribers_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/subscribers",
         :full_name "hoplon/triclojure-hoplon-2016",
         :blobs_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/git/blobs{/sha}",
         :subscription_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/subscription",
         :fork false,
         :deployments_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/deployments",
         :pushed_at "2016-11-10T02:06:01Z",
         :owner
         {:html_url "https://github.com/hoplon",
          :gravatar_id "",
          :followers_url "https://api.github.com/users/hoplon/followers",
          :subscriptions_url
          "https://api.github.com/users/hoplon/subscriptions",
          :site_admin false,
          :following_url
          "https://api.github.com/users/hoplon/following{/other_user}",
          :type "Organization",
          :received_events_url
          "https://api.github.com/users/hoplon/received_events",
          :login "hoplon",
          :organizations_url "https://api.github.com/users/hoplon/orgs",
          :id 10911336,
          :events_url "https://api.github.com/users/hoplon/events{/privacy}",
          :url "https://api.github.com/users/hoplon",
          :repos_url "https://api.github.com/users/hoplon/repos",
          :starred_url
          "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
          :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
          :avatar_url
          "https://avatars0.githubusercontent.com/u/10911336?v=3"},
         :git_tags_url
         "https://api.github.com/repos/hoplon/triclojure-hoplon-2016/git/tags{/sha}",
         :created_at "2016-11-09T17:51:02Z",
         :mirror_url nil}
        {:html_url "https://github.com/hoplon/twitter-bootstrap",
          :description "hoplon components for twitter bootstrap",
          :open_issues_count 0,
          :watchers 1,
          :ssh_url "git@github.com:hoplon/twitter-bootstrap.git",
          :hooks_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/hooks",
          :archive_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/keys{/key_id}",
          :forks_count 2,
          :languages_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/languages",
          :git_url "git://github.com/hoplon/twitter-bootstrap.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/git/refs{/sha}",
          :clone_url "https://github.com/hoplon/twitter-bootstrap.git",
          :contents_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/contents/{+path}",
          :has_downloads true,
          :teams_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/teams",
          :has_issues true,
          :issue_events_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/issues/events{/number}",
          :private false,
          :watchers_count 1,
          :collaborators_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/collaborators{/collaborator}",
          :homepage nil,
          :git_commits_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/git/commits{/sha}",
          :name "twitter-bootstrap",
          :releases_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/milestones{/number}",
          :svn_url "https://github.com/hoplon/twitter-bootstrap",
          :merges_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/merges",
          :compare_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/compare/{base}...{head}",
          :stargazers_count 1,
          :tags_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/tags",
          :statuses_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 123,
          :assignees_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/labels{/name}",
          :forks_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/forks",
          :contributors_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/contributors",
          :updated_at "2015-04-25T19:23:51Z",
          :pulls_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/pulls{/number}",
          :has_pages false,
          :default_branch "master",
          :language "Clojure",
          :comments_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/comments{/number}",
          :id 30786103,
          :stargazers_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/stargazers",
          :issues_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/issues{/number}",
          :trees_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/git/trees{/sha}",
          :events_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/events",
          :branches_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/branches{/branch}",
          :url "https://api.github.com/repos/hoplon/twitter-bootstrap",
          :downloads_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/downloads",
          :forks 2,
          :subscribers_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/subscribers",
          :full_name "hoplon/twitter-bootstrap",
          :blobs_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/subscription",
          :fork false,
          :deployments_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/deployments",
          :pushed_at "2015-09-23T03:31:20Z",
          :owner
          {:html_url "https://github.com/hoplon",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/hoplon/followers",
           :subscriptions_url
           "https://api.github.com/users/hoplon/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/hoplon/following{/other_user}",
           :type "Organization",
           :received_events_url
           "https://api.github.com/users/hoplon/received_events",
           :login "hoplon",
           :organizations_url "https://api.github.com/users/hoplon/orgs",
           :id 10911336,
           :events_url "https://api.github.com/users/hoplon/events{/privacy}",
           :url "https://api.github.com/users/hoplon",
           :repos_url "https://api.github.com/users/hoplon/repos",
           :starred_url
           "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
           :avatar_url
           "https://avatars0.githubusercontent.com/u/10911336?v=3"},
          :git_tags_url
          "https://api.github.com/repos/hoplon/twitter-bootstrap/git/tags{/sha}",
          :created_at "2015-02-14T03:37:22Z",
          :mirror_url nil}
         {:html_url "https://github.com/hoplon/ui",
          :description "experimental ui component library for the browser",
          :open_issues_count 17,
          :watchers 19,
          :ssh_url "git@github.com:hoplon/ui.git",
          :hooks_url "https://api.github.com/repos/hoplon/ui/hooks",
          :archive_url
          "https://api.github.com/repos/hoplon/ui/{archive_format}{/ref}",
          :keys_url "https://api.github.com/repos/hoplon/ui/keys{/key_id}",
          :forks_count 7,
          :languages_url "https://api.github.com/repos/hoplon/ui/languages",
          :git_url "git://github.com/hoplon/ui.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/hoplon/ui/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/hoplon/ui/git/refs{/sha}",
          :clone_url "https://github.com/hoplon/ui.git",
          :contents_url
          "https://api.github.com/repos/hoplon/ui/contents/{+path}",
          :has_downloads true,
          :teams_url "https://api.github.com/repos/hoplon/ui/teams",
          :has_issues true,
          :issue_events_url
          "https://api.github.com/repos/hoplon/ui/issues/events{/number}",
          :private false,
          :watchers_count 19,
          :collaborators_url
          "https://api.github.com/repos/hoplon/ui/collaborators{/collaborator}",
          :homepage nil,
          :git_commits_url
          "https://api.github.com/repos/hoplon/ui/git/commits{/sha}",
          :name "ui",
          :releases_url "https://api.github.com/repos/hoplon/ui/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/hoplon/ui/milestones{/number}",
          :svn_url "https://github.com/hoplon/ui",
          :merges_url "https://api.github.com/repos/hoplon/ui/merges",
          :compare_url
          "https://api.github.com/repos/hoplon/ui/compare/{base}...{head}",
          :stargazers_count 19,
          :tags_url "https://api.github.com/repos/hoplon/ui/tags",
          :statuses_url
          "https://api.github.com/repos/hoplon/ui/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/hoplon/ui/notifications{?since,all,participating}",
          :open_issues 17,
          :has_wiki true,
          :size 755,
          :assignees_url
          "https://api.github.com/repos/hoplon/ui/assignees{/user}",
          :commits_url "https://api.github.com/repos/hoplon/ui/commits{/sha}",
          :labels_url "https://api.github.com/repos/hoplon/ui/labels{/name}",
          :forks_url "https://api.github.com/repos/hoplon/ui/forks",
          :contributors_url
          "https://api.github.com/repos/hoplon/ui/contributors",
          :updated_at "2016-11-25T06:52:29Z",
          :pulls_url "https://api.github.com/repos/hoplon/ui/pulls{/number}",
          :has_pages false,
          :default_branch "master",
          :language "Clojure",
          :comments_url
          "https://api.github.com/repos/hoplon/ui/comments{/number}",
          :id 55512287,
          :stargazers_url "https://api.github.com/repos/hoplon/ui/stargazers",
          :issues_url "https://api.github.com/repos/hoplon/ui/issues{/number}",
          :trees_url "https://api.github.com/repos/hoplon/ui/git/trees{/sha}",
          :events_url "https://api.github.com/repos/hoplon/ui/events",
          :branches_url
          "https://api.github.com/repos/hoplon/ui/branches{/branch}",
          :url "https://api.github.com/repos/hoplon/ui",
          :downloads_url "https://api.github.com/repos/hoplon/ui/downloads",
          :forks 7,
          :subscribers_url
          "https://api.github.com/repos/hoplon/ui/subscribers",
          :full_name "hoplon/ui",
          :blobs_url "https://api.github.com/repos/hoplon/ui/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/hoplon/ui/subscription",
          :fork false,
          :deployments_url
          "https://api.github.com/repos/hoplon/ui/deployments",
          :pushed_at "2017-03-12T03:54:47Z",
          :owner
          {:html_url "https://github.com/hoplon",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/hoplon/followers",
           :subscriptions_url
           "https://api.github.com/users/hoplon/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/hoplon/following{/other_user}",
           :type "Organization",
           :received_events_url
           "https://api.github.com/users/hoplon/received_events",
           :login "hoplon",
           :organizations_url "https://api.github.com/users/hoplon/orgs",
           :id 10911336,
           :events_url "https://api.github.com/users/hoplon/events{/privacy}",
           :url "https://api.github.com/users/hoplon",
           :repos_url "https://api.github.com/users/hoplon/repos",
           :starred_url
           "https://api.github.com/users/hoplon/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/hoplon/gists{/gist_id}",
           :avatar_url
           "https://avatars0.githubusercontent.com/u/10911336?v=3"},
          :git_tags_url
          "https://api.github.com/repos/hoplon/ui/git/tags{/sha}",
          :created_at "2016-04-05T13:57:30Z",
          :mirror_url nil}
         {:html_url "https://github.com/hoplon-vendor/jquery",
          :description "JQuery JAR dependency hosted on Clojars.",
          :open_issues_count 0,
          :watchers 0,
          :ssh_url "git@github.com:hoplon-vendor/jquery.git",
          :hooks_url "https://api.github.com/repos/hoplon-vendor/jquery/hooks",
          :archive_url
          "https://api.github.com/repos/hoplon-vendor/jquery/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/hoplon-vendor/jquery/keys{/key_id}",
          :forks_count 0,
          :languages_url
          "https://api.github.com/repos/hoplon-vendor/jquery/languages",
          :git_url "git://github.com/hoplon-vendor/jquery.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/hoplon-vendor/jquery/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/hoplon-vendor/jquery/git/refs{/sha}",
          :clone_url "https://github.com/hoplon-vendor/jquery.git",
          :contents_url
          "https://api.github.com/repos/hoplon-vendor/jquery/contents/{+path}",
          :has_downloads true,
          :teams_url "https://api.github.com/repos/hoplon-vendor/jquery/teams",
          :has_issues true,
          :issue_events_url
          "https://api.github.com/repos/hoplon-vendor/jquery/issues/events{/number}",
          :private false,
          :watchers_count 0,
          :collaborators_url
          "https://api.github.com/repos/hoplon-vendor/jquery/collaborators{/collaborator}",
          :homepage nil,
          :git_commits_url
          "https://api.github.com/repos/hoplon-vendor/jquery/git/commits{/sha}",
          :name "jquery",
          :releases_url
          "https://api.github.com/repos/hoplon-vendor/jquery/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/hoplon-vendor/jquery/milestones{/number}",
          :svn_url "https://github.com/hoplon-vendor/jquery",
          :merges_url
          "https://api.github.com/repos/hoplon-vendor/jquery/merges",
          :compare_url
          "https://api.github.com/repos/hoplon-vendor/jquery/compare/{base}...{head}",
          :stargazers_count 0,
          :tags_url "https://api.github.com/repos/hoplon-vendor/jquery/tags",
          :statuses_url
          "https://api.github.com/repos/hoplon-vendor/jquery/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/hoplon-vendor/jquery/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 0,
          :assignees_url
          "https://api.github.com/repos/hoplon-vendor/jquery/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/hoplon-vendor/jquery/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/hoplon-vendor/jquery/labels{/name}",
          :forks_url "https://api.github.com/repos/hoplon-vendor/jquery/forks",
          :contributors_url
          "https://api.github.com/repos/hoplon-vendor/jquery/contributors",
          :updated_at "2014-11-21T22:12:03Z",
          :pulls_url
          "https://api.github.com/repos/hoplon-vendor/jquery/pulls{/number}",
          :has_pages false,
          :default_branch "master",
          :language nil,
          :comments_url
          "https://api.github.com/repos/hoplon-vendor/jquery/comments{/number}",
          :id 26980089,
          :stargazers_url
          "https://api.github.com/repos/hoplon-vendor/jquery/stargazers",
          :issues_url
          "https://api.github.com/repos/hoplon-vendor/jquery/issues{/number}",
          :trees_url
          "https://api.github.com/repos/hoplon-vendor/jquery/git/trees{/sha}",
          :events_url
          "https://api.github.com/repos/hoplon-vendor/jquery/events",
          :branches_url
          "https://api.github.com/repos/hoplon-vendor/jquery/branches{/branch}",
          :url "https://api.github.com/repos/hoplon-vendor/jquery",
          :downloads_url
          "https://api.github.com/repos/hoplon-vendor/jquery/downloads",
          :forks 0,
          :subscribers_url
          "https://api.github.com/repos/hoplon-vendor/jquery/subscribers",
          :full_name "hoplon-vendor/jquery",
          :blobs_url
          "https://api.github.com/repos/hoplon-vendor/jquery/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/hoplon-vendor/jquery/subscription",
          :fork false,
          :deployments_url
          "https://api.github.com/repos/hoplon-vendor/jquery/deployments",
          :pushed_at "2014-11-21T22:12:03Z",
          :owner
          {:html_url "https://github.com/hoplon-vendor",
           :gravatar_id "",
           :followers_url
           "https://api.github.com/users/hoplon-vendor/followers",
           :subscriptions_url
           "https://api.github.com/users/hoplon-vendor/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/hoplon-vendor/following{/other_user}",
           :type "Organization",
           :received_events_url
           "https://api.github.com/users/hoplon-vendor/received_events",
           :login "hoplon-vendor",
           :organizations_url
           "https://api.github.com/users/hoplon-vendor/orgs",
           :id 8495994,
           :events_url
           "https://api.github.com/users/hoplon-vendor/events{/privacy}",
           :url "https://api.github.com/users/hoplon-vendor",
           :repos_url "https://api.github.com/users/hoplon-vendor/repos",
           :starred_url
           "https://api.github.com/users/hoplon-vendor/starred{/owner}{/repo}",
           :gists_url
           "https://api.github.com/users/hoplon-vendor/gists{/gist_id}",
           :avatar_url "https://avatars3.githubusercontent.com/u/8495994?v=3"},
          :git_tags_url
          "https://api.github.com/repos/hoplon-vendor/jquery/git/tags{/sha}",
          :created_at "2014-11-21T22:12:03Z",
          :mirror_url nil}
         {:html_url "https://github.com/mynomoto/app-civil",
          :description nil,
          :open_issues_count 0,
          :watchers 0,
          :ssh_url "git@github.com:mynomoto/app-civil.git",
          :hooks_url "https://api.github.com/repos/mynomoto/app-civil/hooks",
          :archive_url
          "https://api.github.com/repos/mynomoto/app-civil/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/mynomoto/app-civil/keys{/key_id}",
          :forks_count 0,
          :languages_url
          "https://api.github.com/repos/mynomoto/app-civil/languages",
          :git_url "git://github.com/mynomoto/app-civil.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/mynomoto/app-civil/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/mynomoto/app-civil/git/refs{/sha}",
          :clone_url "https://github.com/mynomoto/app-civil.git",
          :contents_url
          "https://api.github.com/repos/mynomoto/app-civil/contents/{+path}",
          :has_downloads true,
          :teams_url "https://api.github.com/repos/mynomoto/app-civil/teams",
          :has_issues true,
          :issue_events_url
          "https://api.github.com/repos/mynomoto/app-civil/issues/events{/number}",
          :private false,
          :watchers_count 0,
          :collaborators_url
          "https://api.github.com/repos/mynomoto/app-civil/collaborators{/collaborator}",
          :homepage nil,
          :git_commits_url
          "https://api.github.com/repos/mynomoto/app-civil/git/commits{/sha}",
          :name "app-civil",
          :releases_url
          "https://api.github.com/repos/mynomoto/app-civil/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/mynomoto/app-civil/milestones{/number}",
          :svn_url "https://github.com/mynomoto/app-civil",
          :merges_url "https://api.github.com/repos/mynomoto/app-civil/merges",
          :compare_url
          "https://api.github.com/repos/mynomoto/app-civil/compare/{base}...{head}",
          :stargazers_count 0,
          :tags_url "https://api.github.com/repos/mynomoto/app-civil/tags",
          :statuses_url
          "https://api.github.com/repos/mynomoto/app-civil/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/mynomoto/app-civil/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 232,
          :assignees_url
          "https://api.github.com/repos/mynomoto/app-civil/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/mynomoto/app-civil/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/mynomoto/app-civil/labels{/name}",
          :forks_url "https://api.github.com/repos/mynomoto/app-civil/forks",
          :contributors_url
          "https://api.github.com/repos/mynomoto/app-civil/contributors",
          :updated_at "2015-01-17T01:51:01Z",
          :pulls_url
          "https://api.github.com/repos/mynomoto/app-civil/pulls{/number}",
          :has_pages true,
          :default_branch "master",
          :language "Clojure",
          :comments_url
          "https://api.github.com/repos/mynomoto/app-civil/comments{/number}",
          :id 28551496,
          :stargazers_url
          "https://api.github.com/repos/mynomoto/app-civil/stargazers",
          :issues_url
          "https://api.github.com/repos/mynomoto/app-civil/issues{/number}",
          :trees_url
          "https://api.github.com/repos/mynomoto/app-civil/git/trees{/sha}",
          :events_url "https://api.github.com/repos/mynomoto/app-civil/events",
          :branches_url
          "https://api.github.com/repos/mynomoto/app-civil/branches{/branch}",
          :url "https://api.github.com/repos/mynomoto/app-civil",
          :downloads_url
          "https://api.github.com/repos/mynomoto/app-civil/downloads",
          :forks 0,
          :subscribers_url
          "https://api.github.com/repos/mynomoto/app-civil/subscribers",
          :full_name "mynomoto/app-civil",
          :blobs_url
          "https://api.github.com/repos/mynomoto/app-civil/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/mynomoto/app-civil/subscription",
          :fork false,
          :deployments_url
          "https://api.github.com/repos/mynomoto/app-civil/deployments",
          :pushed_at "2015-01-19T10:00:46Z",
          :owner
          {:html_url "https://github.com/mynomoto",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/mynomoto/followers",
           :subscriptions_url
           "https://api.github.com/users/mynomoto/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/mynomoto/following{/other_user}",
           :type "User",
           :received_events_url
           "https://api.github.com/users/mynomoto/received_events",
           :login "mynomoto",
           :organizations_url "https://api.github.com/users/mynomoto/orgs",
           :id 178872,
           :events_url
           "https://api.github.com/users/mynomoto/events{/privacy}",
           :url "https://api.github.com/users/mynomoto",
           :repos_url "https://api.github.com/users/mynomoto/repos",
           :starred_url
           "https://api.github.com/users/mynomoto/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/mynomoto/gists{/gist_id}",
           :avatar_url "https://avatars1.githubusercontent.com/u/178872?v=3"},
          :git_tags_url
          "https://api.github.com/repos/mynomoto/app-civil/git/tags{/sha}",
          :created_at "2014-12-28T02:26:22Z",
          :mirror_url nil}
         {:html_url "https://github.com/mynomoto/benefactor",
          :description "A library of clojurescript helpers",
          :open_issues_count 0,
          :watchers 0,
          :ssh_url "git@github.com:mynomoto/benefactor.git",
          :hooks_url "https://api.github.com/repos/mynomoto/benefactor/hooks",
          :archive_url
          "https://api.github.com/repos/mynomoto/benefactor/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/mynomoto/benefactor/keys{/key_id}",
          :forks_count 0,
          :languages_url
          "https://api.github.com/repos/mynomoto/benefactor/languages",
          :git_url "git://github.com/mynomoto/benefactor.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/mynomoto/benefactor/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/mynomoto/benefactor/git/refs{/sha}",
          :clone_url "https://github.com/mynomoto/benefactor.git",
          :contents_url
          "https://api.github.com/repos/mynomoto/benefactor/contents/{+path}",
          :has_downloads true,
          :teams_url "https://api.github.com/repos/mynomoto/benefactor/teams",
          :has_issues true,
          :issue_events_url
          "https://api.github.com/repos/mynomoto/benefactor/issues/events{/number}",
          :private false,
          :watchers_count 0,
          :collaborators_url
          "https://api.github.com/repos/mynomoto/benefactor/collaborators{/collaborator}",
          :homepage nil,
          :git_commits_url
          "https://api.github.com/repos/mynomoto/benefactor/git/commits{/sha}",
          :name "benefactor",
          :releases_url
          "https://api.github.com/repos/mynomoto/benefactor/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/mynomoto/benefactor/milestones{/number}",
          :svn_url "https://github.com/mynomoto/benefactor",
          :merges_url
          "https://api.github.com/repos/mynomoto/benefactor/merges",
          :compare_url
          "https://api.github.com/repos/mynomoto/benefactor/compare/{base}...{head}",
          :stargazers_count 0,
          :tags_url "https://api.github.com/repos/mynomoto/benefactor/tags",
          :statuses_url
          "https://api.github.com/repos/mynomoto/benefactor/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/mynomoto/benefactor/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 15,
          :assignees_url
          "https://api.github.com/repos/mynomoto/benefactor/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/mynomoto/benefactor/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/mynomoto/benefactor/labels{/name}",
          :forks_url "https://api.github.com/repos/mynomoto/benefactor/forks",
          :contributors_url
          "https://api.github.com/repos/mynomoto/benefactor/contributors",
          :updated_at "2017-01-03T04:05:20Z",
          :pulls_url
          "https://api.github.com/repos/mynomoto/benefactor/pulls{/number}",
          :has_pages false,
          :default_branch "master",
          :language "Clojure",
          :comments_url
          "https://api.github.com/repos/mynomoto/benefactor/comments{/number}",
          :id 77882906,
          :stargazers_url
          "https://api.github.com/repos/mynomoto/benefactor/stargazers",
          :issues_url
          "https://api.github.com/repos/mynomoto/benefactor/issues{/number}",
          :trees_url
          "https://api.github.com/repos/mynomoto/benefactor/git/trees{/sha}",
          :events_url
          "https://api.github.com/repos/mynomoto/benefactor/events",
          :branches_url
          "https://api.github.com/repos/mynomoto/benefactor/branches{/branch}",
          :url "https://api.github.com/repos/mynomoto/benefactor",
          :downloads_url
          "https://api.github.com/repos/mynomoto/benefactor/downloads",
          :forks 0,
          :subscribers_url
          "https://api.github.com/repos/mynomoto/benefactor/subscribers",
          :full_name "mynomoto/benefactor",
          :blobs_url
          "https://api.github.com/repos/mynomoto/benefactor/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/mynomoto/benefactor/subscription",
          :fork false,
          :deployments_url
          "https://api.github.com/repos/mynomoto/benefactor/deployments",
          :pushed_at "2017-01-24T23:32:55Z",
          :owner
          {:html_url "https://github.com/mynomoto",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/mynomoto/followers",
           :subscriptions_url
           "https://api.github.com/users/mynomoto/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/mynomoto/following{/other_user}",
           :type "User",
           :received_events_url
           "https://api.github.com/users/mynomoto/received_events",
           :login "mynomoto",
           :organizations_url "https://api.github.com/users/mynomoto/orgs",
           :id 178872,
           :events_url
           "https://api.github.com/users/mynomoto/events{/privacy}",
           :url "https://api.github.com/users/mynomoto",
           :repos_url "https://api.github.com/users/mynomoto/repos",
           :starred_url
           "https://api.github.com/users/mynomoto/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/mynomoto/gists{/gist_id}",
           :avatar_url "https://avatars1.githubusercontent.com/u/178872?v=3"},
          :git_tags_url
          "https://api.github.com/repos/mynomoto/benefactor/git/tags{/sha}",
          :created_at "2017-01-03T04:05:06Z",
          :mirror_url nil}
         {:html_url "https://github.com/mynomoto/cljs-benchmarks",
          :description "Benchmark of parsing wire data on clojurescript",
          :open_issues_count 0,
          :watchers 0,
          :ssh_url "git@github.com:mynomoto/cljs-benchmarks.git",
          :hooks_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/hooks",
          :archive_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/keys{/key_id}",
          :forks_count 0,
          :languages_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/languages",
          :git_url "git://github.com/mynomoto/cljs-benchmarks.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/git/refs{/sha}",
          :clone_url "https://github.com/mynomoto/cljs-benchmarks.git",
          :contents_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/contents/{+path}",
          :has_downloads true,
          :teams_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/teams",
          :has_issues true,
          :issue_events_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/issues/events{/number}",
          :private false,
          :watchers_count 0,
          :collaborators_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/collaborators{/collaborator}",
          :homepage nil,
          :git_commits_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/git/commits{/sha}",
          :name "cljs-benchmarks",
          :releases_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/milestones{/number}",
          :svn_url "https://github.com/mynomoto/cljs-benchmarks",
          :merges_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/merges",
          :compare_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/compare/{base}...{head}",
          :stargazers_count 0,
          :tags_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/tags",
          :statuses_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 195,
          :assignees_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/labels{/name}",
          :forks_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/forks",
          :contributors_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/contributors",
          :updated_at "2017-03-11T18:09:34Z",
          :pulls_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/pulls{/number}",
          :has_pages true,
          :default_branch "master",
          :language "Clojure",
          :comments_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/comments{/number}",
          :id 82512332,
          :stargazers_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/stargazers",
          :issues_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/issues{/number}",
          :trees_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/git/trees{/sha}",
          :events_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/events",
          :branches_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/branches{/branch}",
          :url "https://api.github.com/repos/mynomoto/cljs-benchmarks",
          :downloads_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/downloads",
          :forks 0,
          :subscribers_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/subscribers",
          :full_name "mynomoto/cljs-benchmarks",
          :blobs_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/subscription",
          :fork false,
          :deployments_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/deployments",
          :pushed_at "2017-03-12T17:14:39Z",
          :owner
          {:html_url "https://github.com/mynomoto",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/mynomoto/followers",
           :subscriptions_url
           "https://api.github.com/users/mynomoto/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/mynomoto/following{/other_user}",
           :type "User",
           :received_events_url
           "https://api.github.com/users/mynomoto/received_events",
           :login "mynomoto",
           :organizations_url "https://api.github.com/users/mynomoto/orgs",
           :id 178872,
           :events_url
           "https://api.github.com/users/mynomoto/events{/privacy}",
           :url "https://api.github.com/users/mynomoto",
           :repos_url "https://api.github.com/users/mynomoto/repos",
           :starred_url
           "https://api.github.com/users/mynomoto/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/mynomoto/gists{/gist_id}",
           :avatar_url "https://avatars1.githubusercontent.com/u/178872?v=3"},
          :git_tags_url
          "https://api.github.com/repos/mynomoto/cljs-benchmarks/git/tags{/sha}",
          :created_at "2017-02-20T03:22:43Z",
          :mirror_url nil}
         {:html_url "https://github.com/mynomoto/clojars-web",
          :description
          "A community repository for open-source Clojure libraries",
          :open_issues_count 0,
          :watchers 0,
          :ssh_url "git@github.com:mynomoto/clojars-web.git",
          :hooks_url "https://api.github.com/repos/mynomoto/clojars-web/hooks",
          :archive_url
          "https://api.github.com/repos/mynomoto/clojars-web/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/mynomoto/clojars-web/keys{/key_id}",
          :forks_count 0,
          :languages_url
          "https://api.github.com/repos/mynomoto/clojars-web/languages",
          :git_url "git://github.com/mynomoto/clojars-web.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/mynomoto/clojars-web/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/mynomoto/clojars-web/git/refs{/sha}",
          :clone_url "https://github.com/mynomoto/clojars-web.git",
          :contents_url
          "https://api.github.com/repos/mynomoto/clojars-web/contents/{+path}",
          :has_downloads false,
          :teams_url "https://api.github.com/repos/mynomoto/clojars-web/teams",
          :has_issues false,
          :issue_events_url
          "https://api.github.com/repos/mynomoto/clojars-web/issues/events{/number}",
          :private false,
          :watchers_count 0,
          :collaborators_url
          "https://api.github.com/repos/mynomoto/clojars-web/collaborators{/collaborator}",
          :homepage "https://clojars.org/",
          :git_commits_url
          "https://api.github.com/repos/mynomoto/clojars-web/git/commits{/sha}",
          :name "clojars-web",
          :releases_url
          "https://api.github.com/repos/mynomoto/clojars-web/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/mynomoto/clojars-web/milestones{/number}",
          :svn_url "https://github.com/mynomoto/clojars-web",
          :merges_url
          "https://api.github.com/repos/mynomoto/clojars-web/merges",
          :compare_url
          "https://api.github.com/repos/mynomoto/clojars-web/compare/{base}...{head}",
          :stargazers_count 0,
          :tags_url "https://api.github.com/repos/mynomoto/clojars-web/tags",
          :statuses_url
          "https://api.github.com/repos/mynomoto/clojars-web/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/mynomoto/clojars-web/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 1907,
          :assignees_url
          "https://api.github.com/repos/mynomoto/clojars-web/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/mynomoto/clojars-web/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/mynomoto/clojars-web/labels{/name}",
          :forks_url "https://api.github.com/repos/mynomoto/clojars-web/forks",
          :contributors_url
          "https://api.github.com/repos/mynomoto/clojars-web/contributors",
          :updated_at "2016-10-04T19:58:46Z",
          :pulls_url
          "https://api.github.com/repos/mynomoto/clojars-web/pulls{/number}",
          :has_pages false,
          :default_branch "master",
          :language "Clojure",
          :comments_url
          "https://api.github.com/repos/mynomoto/clojars-web/comments{/number}",
          :id 70001155,
          :stargazers_url
          "https://api.github.com/repos/mynomoto/clojars-web/stargazers",
          :issues_url
          "https://api.github.com/repos/mynomoto/clojars-web/issues{/number}",
          :trees_url
          "https://api.github.com/repos/mynomoto/clojars-web/git/trees{/sha}",
          :events_url
          "https://api.github.com/repos/mynomoto/clojars-web/events",
          :branches_url
          "https://api.github.com/repos/mynomoto/clojars-web/branches{/branch}",
          :url "https://api.github.com/repos/mynomoto/clojars-web",
          :downloads_url
          "https://api.github.com/repos/mynomoto/clojars-web/downloads",
          :forks 0,
          :subscribers_url
          "https://api.github.com/repos/mynomoto/clojars-web/subscribers",
          :full_name "mynomoto/clojars-web",
          :blobs_url
          "https://api.github.com/repos/mynomoto/clojars-web/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/mynomoto/clojars-web/subscription",
          :fork true,
          :deployments_url
          "https://api.github.com/repos/mynomoto/clojars-web/deployments",
          :pushed_at "2017-03-12T20:20:18Z",
          :owner
          {:html_url "https://github.com/mynomoto",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/mynomoto/followers",
           :subscriptions_url
           "https://api.github.com/users/mynomoto/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/mynomoto/following{/other_user}",
           :type "User",
           :received_events_url
           "https://api.github.com/users/mynomoto/received_events",
           :login "mynomoto",
           :organizations_url "https://api.github.com/users/mynomoto/orgs",
           :id 178872,
           :events_url
           "https://api.github.com/users/mynomoto/events{/privacy}",
           :url "https://api.github.com/users/mynomoto",
           :repos_url "https://api.github.com/users/mynomoto/repos",
           :starred_url
           "https://api.github.com/users/mynomoto/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/mynomoto/gists{/gist_id}",
           :avatar_url "https://avatars1.githubusercontent.com/u/178872?v=3"},
          :git_tags_url
          "https://api.github.com/repos/mynomoto/clojars-web/git/tags{/sha}",
          :created_at "2016-10-04T19:58:45Z",
          :mirror_url nil}
         {:html_url "https://github.com/mynomoto/clojure-toolbox.com",
          :description "Source to clojure-toolbox.com",
          :open_issues_count 0,
          :watchers 0,
          :ssh_url "git@github.com:mynomoto/clojure-toolbox.com.git",
          :hooks_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/hooks",
          :archive_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/keys{/key_id}",
          :forks_count 0,
          :languages_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/languages",
          :git_url "git://github.com/mynomoto/clojure-toolbox.com.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/git/refs{/sha}",
          :clone_url "https://github.com/mynomoto/clojure-toolbox.com.git",
          :contents_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/contents/{+path}",
          :has_downloads true,
          :teams_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/teams",
          :has_issues false,
          :issue_events_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/issues/events{/number}",
          :private false,
          :watchers_count 0,
          :collaborators_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/collaborators{/collaborator}",
          :homepage "http://www.clojure-toolbox.com",
          :git_commits_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/git/commits{/sha}",
          :name "clojure-toolbox.com",
          :releases_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/milestones{/number}",
          :svn_url "https://github.com/mynomoto/clojure-toolbox.com",
          :merges_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/merges",
          :compare_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/compare/{base}...{head}",
          :stargazers_count 0,
          :tags_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/tags",
          :statuses_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 523,
          :assignees_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/labels{/name}",
          :forks_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/forks",
          :contributors_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/contributors",
          :updated_at "2015-10-06T03:24:03Z",
          :pulls_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/pulls{/number}",
          :has_pages false,
          :default_branch "master",
          :language "CSS",
          :comments_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/comments{/number}",
          :id 43727804,
          :stargazers_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/stargazers",
          :issues_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/issues{/number}",
          :trees_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/git/trees{/sha}",
          :events_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/events",
          :branches_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/branches{/branch}",
          :url "https://api.github.com/repos/mynomoto/clojure-toolbox.com",
          :downloads_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/downloads",
          :forks 0,
          :subscribers_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/subscribers",
          :full_name "mynomoto/clojure-toolbox.com",
          :blobs_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/subscription",
          :fork true,
          :deployments_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/deployments",
          :pushed_at "2015-10-06T03:38:02Z",
          :owner
          {:html_url "https://github.com/mynomoto",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/mynomoto/followers",
           :subscriptions_url
           "https://api.github.com/users/mynomoto/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/mynomoto/following{/other_user}",
           :type "User",
           :received_events_url
           "https://api.github.com/users/mynomoto/received_events",
           :login "mynomoto",
           :organizations_url "https://api.github.com/users/mynomoto/orgs",
           :id 178872,
           :events_url
           "https://api.github.com/users/mynomoto/events{/privacy}",
           :url "https://api.github.com/users/mynomoto",
           :repos_url "https://api.github.com/users/mynomoto/repos",
           :starred_url
           "https://api.github.com/users/mynomoto/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/mynomoto/gists{/gist_id}",
           :avatar_url "https://avatars1.githubusercontent.com/u/178872?v=3"},
          :git_tags_url
          "https://api.github.com/repos/mynomoto/clojure-toolbox.com/git/tags{/sha}",
          :created_at "2015-10-06T03:24:01Z",
          :mirror_url nil}
         {:html_url "https://github.com/mynomoto/confetti",
          :description "A tool to help authoring static sites with AWS.",
          :open_issues_count 0,
          :watchers 0,
          :ssh_url "git@github.com:mynomoto/confetti.git",
          :hooks_url "https://api.github.com/repos/mynomoto/confetti/hooks",
          :archive_url
          "https://api.github.com/repos/mynomoto/confetti/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/mynomoto/confetti/keys{/key_id}",
          :forks_count 0,
          :languages_url
          "https://api.github.com/repos/mynomoto/confetti/languages",
          :git_url "git://github.com/mynomoto/confetti.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/mynomoto/confetti/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/mynomoto/confetti/git/refs{/sha}",
          :clone_url "https://github.com/mynomoto/confetti.git",
          :contents_url
          "https://api.github.com/repos/mynomoto/confetti/contents/{+path}",
          :has_downloads true,
          :teams_url "https://api.github.com/repos/mynomoto/confetti/teams",
          :has_issues false,
          :issue_events_url
          "https://api.github.com/repos/mynomoto/confetti/issues/events{/number}",
          :private false,
          :watchers_count 0,
          :collaborators_url
          "https://api.github.com/repos/mynomoto/confetti/collaborators{/collaborator}",
          :homepage "",
          :git_commits_url
          "https://api.github.com/repos/mynomoto/confetti/git/commits{/sha}",
          :name "confetti",
          :releases_url
          "https://api.github.com/repos/mynomoto/confetti/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/mynomoto/confetti/milestones{/number}",
          :svn_url "https://github.com/mynomoto/confetti",
          :merges_url "https://api.github.com/repos/mynomoto/confetti/merges",
          :compare_url
          "https://api.github.com/repos/mynomoto/confetti/compare/{base}...{head}",
          :stargazers_count 0,
          :tags_url "https://api.github.com/repos/mynomoto/confetti/tags",
          :statuses_url
          "https://api.github.com/repos/mynomoto/confetti/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/mynomoto/confetti/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 87,
          :assignees_url
          "https://api.github.com/repos/mynomoto/confetti/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/mynomoto/confetti/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/mynomoto/confetti/labels{/name}",
          :forks_url "https://api.github.com/repos/mynomoto/confetti/forks",
          :contributors_url
          "https://api.github.com/repos/mynomoto/confetti/contributors",
          :updated_at "2016-10-18T01:18:37Z",
          :pulls_url
          "https://api.github.com/repos/mynomoto/confetti/pulls{/number}",
          :has_pages false,
          :default_branch "master",
          :language "Clojure",
          :comments_url
          "https://api.github.com/repos/mynomoto/confetti/comments{/number}",
          :id 71195642,
          :stargazers_url
          "https://api.github.com/repos/mynomoto/confetti/stargazers",
          :issues_url
          "https://api.github.com/repos/mynomoto/confetti/issues{/number}",
          :trees_url
          "https://api.github.com/repos/mynomoto/confetti/git/trees{/sha}",
          :events_url "https://api.github.com/repos/mynomoto/confetti/events",
          :branches_url
          "https://api.github.com/repos/mynomoto/confetti/branches{/branch}",
          :url "https://api.github.com/repos/mynomoto/confetti",
          :downloads_url
          "https://api.github.com/repos/mynomoto/confetti/downloads",
          :forks 0,
          :subscribers_url
          "https://api.github.com/repos/mynomoto/confetti/subscribers",
          :full_name "mynomoto/confetti",
          :blobs_url
          "https://api.github.com/repos/mynomoto/confetti/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/mynomoto/confetti/subscription",
          :fork true,
          :deployments_url
          "https://api.github.com/repos/mynomoto/confetti/deployments",
          :pushed_at "2016-11-26T20:13:59Z",
          :owner
          {:html_url "https://github.com/mynomoto",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/mynomoto/followers",
           :subscriptions_url
           "https://api.github.com/users/mynomoto/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/mynomoto/following{/other_user}",
           :type "User",
           :received_events_url
           "https://api.github.com/users/mynomoto/received_events",
           :login "mynomoto",
           :organizations_url "https://api.github.com/users/mynomoto/orgs",
           :id 178872,
           :events_url
           "https://api.github.com/users/mynomoto/events{/privacy}",
           :url "https://api.github.com/users/mynomoto",
           :repos_url "https://api.github.com/users/mynomoto/repos",
           :starred_url
           "https://api.github.com/users/mynomoto/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/mynomoto/gists{/gist_id}",
           :avatar_url "https://avatars1.githubusercontent.com/u/178872?v=3"},
          :git_tags_url
          "https://api.github.com/repos/mynomoto/confetti/git/tags{/sha}",
          :created_at "2016-10-18T01:18:36Z",
          :mirror_url nil}
         {:html_url "https://github.com/mynomoto/docker-exploration",
          :description "Explore tools using dockerfiles",
          :open_issues_count 0,
          :watchers 0,
          :ssh_url "git@github.com:mynomoto/docker-exploration.git",
          :hooks_url
          "https://api.github.com/repos/mynomoto/docker-exploration/hooks",
          :archive_url
          "https://api.github.com/repos/mynomoto/docker-exploration/{archive_format}{/ref}",
          :keys_url
          "https://api.github.com/repos/mynomoto/docker-exploration/keys{/key_id}",
          :forks_count 0,
          :languages_url
          "https://api.github.com/repos/mynomoto/docker-exploration/languages",
          :git_url "git://github.com/mynomoto/docker-exploration.git",
          :permissions {:admin true, :push true, :pull true},
          :issue_comment_url
          "https://api.github.com/repos/mynomoto/docker-exploration/issues/comments{/number}",
          :git_refs_url
          "https://api.github.com/repos/mynomoto/docker-exploration/git/refs{/sha}",
          :clone_url "https://github.com/mynomoto/docker-exploration.git",
          :contents_url
          "https://api.github.com/repos/mynomoto/docker-exploration/contents/{+path}",
          :has_downloads true,
          :teams_url
          "https://api.github.com/repos/mynomoto/docker-exploration/teams",
          :has_issues true,
          :issue_events_url
          "https://api.github.com/repos/mynomoto/docker-exploration/issues/events{/number}",
          :private false,
          :watchers_count 0,
          :collaborators_url
          "https://api.github.com/repos/mynomoto/docker-exploration/collaborators{/collaborator}",
          :homepage nil,
          :git_commits_url
          "https://api.github.com/repos/mynomoto/docker-exploration/git/commits{/sha}",
          :name "docker-exploration",
          :releases_url
          "https://api.github.com/repos/mynomoto/docker-exploration/releases{/id}",
          :milestones_url
          "https://api.github.com/repos/mynomoto/docker-exploration/milestones{/number}",
          :svn_url "https://github.com/mynomoto/docker-exploration",
          :merges_url
          "https://api.github.com/repos/mynomoto/docker-exploration/merges",
          :compare_url
          "https://api.github.com/repos/mynomoto/docker-exploration/compare/{base}...{head}",
          :stargazers_count 0,
          :tags_url
          "https://api.github.com/repos/mynomoto/docker-exploration/tags",
          :statuses_url
          "https://api.github.com/repos/mynomoto/docker-exploration/statuses/{sha}",
          :notifications_url
          "https://api.github.com/repos/mynomoto/docker-exploration/notifications{?since,all,participating}",
          :open_issues 0,
          :has_wiki true,
          :size 2,
          :assignees_url
          "https://api.github.com/repos/mynomoto/docker-exploration/assignees{/user}",
          :commits_url
          "https://api.github.com/repos/mynomoto/docker-exploration/commits{/sha}",
          :labels_url
          "https://api.github.com/repos/mynomoto/docker-exploration/labels{/name}",
          :forks_url
          "https://api.github.com/repos/mynomoto/docker-exploration/forks",
          :contributors_url
          "https://api.github.com/repos/mynomoto/docker-exploration/contributors",
          :updated_at "2016-03-23T20:58:52Z",
          :pulls_url
          "https://api.github.com/repos/mynomoto/docker-exploration/pulls{/number}",
          :has_pages false,
          :default_branch "master",
          :language "Shell",
          :comments_url
          "https://api.github.com/repos/mynomoto/docker-exploration/comments{/number}",
          :id 54340855,
          :stargazers_url
          "https://api.github.com/repos/mynomoto/docker-exploration/stargazers",
          :issues_url
          "https://api.github.com/repos/mynomoto/docker-exploration/issues{/number}",
          :trees_url
          "https://api.github.com/repos/mynomoto/docker-exploration/git/trees{/sha}",
          :events_url
          "https://api.github.com/repos/mynomoto/docker-exploration/events",
          :branches_url
          "https://api.github.com/repos/mynomoto/docker-exploration/branches{/branch}",
          :url "https://api.github.com/repos/mynomoto/docker-exploration",
          :downloads_url
          "https://api.github.com/repos/mynomoto/docker-exploration/downloads",
          :forks 0,
          :subscribers_url
          "https://api.github.com/repos/mynomoto/docker-exploration/subscribers",
          :full_name "mynomoto/docker-exploration",
          :blobs_url
          "https://api.github.com/repos/mynomoto/docker-exploration/git/blobs{/sha}",
          :subscription_url
          "https://api.github.com/repos/mynomoto/docker-exploration/subscription",
          :fork false,
          :deployments_url
          "https://api.github.com/repos/mynomoto/docker-exploration/deployments",
          :pushed_at "2016-03-28T14:22:51Z",
          :owner
          {:html_url "https://github.com/mynomoto",
           :gravatar_id "",
           :followers_url "https://api.github.com/users/mynomoto/followers",
           :subscriptions_url
           "https://api.github.com/users/mynomoto/subscriptions",
           :site_admin false,
           :following_url
           "https://api.github.com/users/mynomoto/following{/other_user}",
           :type "User",
           :received_events_url
           "https://api.github.com/users/mynomoto/received_events",
           :login "mynomoto",
           :organizations_url "https://api.github.com/users/mynomoto/orgs",
           :id 178872,
           :events_url
           "https://api.github.com/users/mynomoto/events{/privacy}",
           :url "https://api.github.com/users/mynomoto",
           :repos_url "https://api.github.com/users/mynomoto/repos",
           :starred_url
           "https://api.github.com/users/mynomoto/starred{/owner}{/repo}",
           :gists_url "https://api.github.com/users/mynomoto/gists{/gist_id}",
           :avatar_url "https://avatars1.githubusercontent.com/u/178872?v=3"},
          :git_tags_url
          "https://api.github.com/repos/mynomoto/docker-exploration/git/tags{/sha}",
          :created_at "2016-03-20T21:15:22Z",
          :mirror_url nil}]})
