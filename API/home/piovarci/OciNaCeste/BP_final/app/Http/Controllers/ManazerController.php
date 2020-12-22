<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ManazerController extends Controller
{
    public function index()
    {
        return redirect('/problem');
    }

    public function __construct()
    {
        $this->middleware('auth');
        $this->middleware('role:manazer');
    }
}
