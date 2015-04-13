# markov_persistence

Right now a command line interface for generating a markov matrix and
writing it to a file.
To be expanded for working with large data sets/matrices using some kind of database.

## Usage

Setup: install the project to generate a markov matrix:
```` bash
git clone git@github.com:eidens/markov.git markov
cd markov
lein install
````

```` bash
echo "(1 0 1)" > walk.edn
lein run frequencies -i walk.edn
=> {(0) {(1) 1}, (1) {(0) 1}}
````

```` bash
echo "(1 0 1)" > walk.edn
lein run frequencies -i walk.edn -f matrix.edn
````

## License

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
