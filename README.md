# ion-cast-issue

Recreating an issue with cast logging when also requiring datomic.dev-local.

Run `clj -X log/run`

Expect:
```
From println
{:msg "From cast/dev"}
From println 2
{:msg "From cast/dev 2"}
```

But actually only seeing:
```
From println
From println 2
```

