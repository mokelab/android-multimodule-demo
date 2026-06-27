package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data221RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data222RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data223RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data224RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data225RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data226RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data227RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data228RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data229RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data230RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen023ViewModel @Inject constructor(
    private val repo1: Data221RepositoryImpl,
    private val repo2: Data222RepositoryImpl,
    private val repo3: Data223RepositoryImpl,
    private val repo4: Data224RepositoryImpl,
    private val repo5: Data225RepositoryImpl,
    private val repo6: Data226RepositoryImpl,
    private val repo7: Data227RepositoryImpl,
    private val repo8: Data228RepositoryImpl,
    private val repo9: Data229RepositoryImpl,
    private val repo10: Data230RepositoryImpl,

): ViewModel() {
}
